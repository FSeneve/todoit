package com.digisene.taskmanagement.service.impl;

import com.digisene.taskmanagement.dto.TaskDto;
import com.digisene.taskmanagement.entity.Category;
import com.digisene.taskmanagement.entity.Task;
import com.digisene.taskmanagement.exception.ResourceNotFoundException;
import com.digisene.taskmanagement.mapper.TaskMapper;
import com.digisene.taskmanagement.repository.CategoryRepository;
import com.digisene.taskmanagement.repository.TaskRepository;
import com.digisene.taskmanagement.service.TaskService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TaskServiceImpl implements TaskService {

    private TaskRepository taskRepository;
    private CategoryRepository categoryRepository;
    private TaskMapper taskMapper;

    @Override
    public List<TaskDto> getAllTasks() {
        return taskRepository.findAll().stream().map(task->taskMapper.toDto(task)).toList();
    }

    @Override
    public TaskDto getTaskById(Long id) {
        Task task = taskRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Task not found"));
        return taskMapper.toDto(task);
    }

    @Override
    public TaskDto createTask(TaskDto taskDto) {

        Category category = categoryRepository.findById(taskDto.categoryId()).orElseThrow(()->new ResourceNotFoundException("Category not found"));

        Task task = new Task();

        task.setCategory(category);
        task.setDescription(taskDto.description());
        task.setTitle(taskDto.title());
        task.setStatus(taskDto.status());
        Task savedTask = taskRepository.save(task);
        return taskMapper.toDto(savedTask);
    }

    @Override
    public TaskDto updateTask(TaskDto taskDto, Long id) {
        return null;
    }

    @Override
    public void deleteTaskById(Long id) {

    }
}
