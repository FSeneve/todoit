package com.digisene.taskmanagement.dto;

import com.digisene.taskmanagement.enums.TaskStatus;

public record TaskDto(Long id, String name, String description, String category, TaskStatus status)  {
}
