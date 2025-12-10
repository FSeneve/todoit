package com.digisene.taskmanagement.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record CategoryDto(String name, String description, @JsonProperty("user_id") Long userId) {
}
