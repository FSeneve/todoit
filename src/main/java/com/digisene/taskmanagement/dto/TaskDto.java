package com.digisene.taskmanagement.dto;

import com.digisene.taskmanagement.enums.TaskStatus;
import com.fasterxml.jackson.annotation.JsonProperty;

public record TaskDto(String title, String description, @JsonProperty("category_id") Long categoryId, TaskStatus status)  {
}
