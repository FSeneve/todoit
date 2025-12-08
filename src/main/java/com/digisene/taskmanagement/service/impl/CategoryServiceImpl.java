package com.digisene.taskmanagement.service.impl;

import com.digisene.taskmanagement.dto.CategoryDto;
import com.digisene.taskmanagement.entity.Category;
import com.digisene.taskmanagement.exception.ResourceNotFoundException;
import com.digisene.taskmanagement.mapper.CategoryMapper;
import com.digisene.taskmanagement.repository.CategoryRepository;
import com.digisene.taskmanagement.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private CategoryMapper categoryMapper;
    private CategoryRepository categoryRepository;



    @Override
    public List<CategoryDto> getAllCategories() {
        return categoryRepository.findAll().stream().map(category -> categoryMapper.toDto(category)).toList();
    }

    @Override
    public CategoryDto getCategoryById(Long id) {
        Category category = categoryRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Category not found"));
        return categoryMapper.toDto(category);
    }

    @Override
    public CategoryDto createCategory(CategoryDto categoryDto) {
        Category category = categoryMapper.toEntity(categoryDto);
        return categoryMapper.toDto(categoryRepository.save(category));
    }

    @Override
    public CategoryDto updateCategory(CategoryDto categoryDto, Long id) {
        Category category = categoryRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Category not found"));

        category.setName(categoryDto.name());
        category.setDescription(categoryDto.description());

        Category updatedCategory = categoryRepository.save(category);

        return categoryMapper.toDto(updatedCategory);
    }

    @Override
    public void deleteCategoryById(Long id) {
       categoryRepository.deleteById(id);
    }
}
