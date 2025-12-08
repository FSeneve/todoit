package com.digisene.taskmanagement.service.impl;

import com.digisene.taskmanagement.dto.TaskDto;
import com.digisene.taskmanagement.service.TaskService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    @Override
    public List<TaskDto> getAllTasks() {
        return List.of();
    }

    @Override
    public TaskDto getTaskById(Long id) {
        return null;
    }

    @Override
    public TaskDto createTask(TaskDto taskDto) {
        return null;
    }

    @Override
    public TaskDto updateTask(TaskDto taskDto, Long id) {
        return null;
    }

    @Override
    public void deleteTaskById(Long id) {

    }
}
