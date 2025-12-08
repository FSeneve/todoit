package com.digisene.taskmanagement.mapper;

import com.digisene.taskmanagement.dto.TaskDto;
import com.digisene.taskmanagement.dto.TaskResponseDto;
import com.digisene.taskmanagement.entity.Task;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TaskMapper {
    TaskDto toDto(Task task);
    Task toEntity(TaskDto taskDto);

    TaskResponseDto toResponseDto(Task task);
}
