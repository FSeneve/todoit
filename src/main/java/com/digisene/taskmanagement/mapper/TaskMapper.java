package com.digisene.taskmanagement.mapper;

import com.digisene.taskmanagement.dto.TaskDto;
import com.digisene.taskmanagement.dto.TaskResponseDto;
import com.digisene.taskmanagement.entity.Task;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TaskMapper {

    // ENTITY -> DTO
    @Mapping(source = "category.id", target = "categoryId")
    @Mapping(source = "user.id", target = "userId")
    TaskDto toDto(Task task);

    // DTO -> ENTITY
    @Mapping(target = "category", ignore = true)
    @Mapping(target = "user", ignore = true)
    @Mapping(target = "id", ignore = true)
    Task toEntity(TaskDto taskDto);
}

