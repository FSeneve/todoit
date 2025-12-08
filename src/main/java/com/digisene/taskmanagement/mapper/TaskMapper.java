package com.digisene.taskmanagement.mapper;

import com.digisene.taskmanagement.dto.TaskDto;
import com.digisene.taskmanagement.dto.TaskResponseDto;
import com.digisene.taskmanagement.entity.Task;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TaskMapper {
    // Mapper l'ID de la catégorie depuis task.category.id vers taskDto.categoryId
    @Mapping(source = "category.id", target = "categoryId")
    TaskDto toDto(Task task);

    // Ignorer la catégorie lors de la conversion DTO -> Entity
    // (la catégorie sera définie manuellement dans le service)
    @Mapping(target = "category", ignore = true)
    @Mapping(target = "id", ignore = true)
    Task toEntity(TaskDto taskDto);

    TaskResponseDto toResponseDto(Task task);
}
