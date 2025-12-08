package com.digisene.taskmanagement.mapper;

import com.digisene.taskmanagement.dto.CategoryDto;
import com.digisene.taskmanagement.entity.Category;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    CategoryDto toDto(Category category);
    Category toEntity(CategoryDto categoryDto);
}
