package com.digisene.taskmanagement.service;

import com.digisene.taskmanagement.dto.TaskDto;

import java.util.List;

public interface TaskService {
    List<TaskDto> getAllTasks();

    TaskDto getTaskById(Long id);

    TaskDto createTask(TaskDto taskDto);

    TaskDto updateTask(TaskDto taskDto, Long id);

    void deleteTaskById(Long id);
}
