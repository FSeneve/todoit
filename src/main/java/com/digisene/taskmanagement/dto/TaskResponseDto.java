package com.digisene.taskmanagement.dto;

import com.digisene.taskmanagement.enums.TaskStatus;

public record TaskResponseDto(
        Long id,
        String title,
        String description,
        TaskStatus status,
        CategoryDto category
) {}