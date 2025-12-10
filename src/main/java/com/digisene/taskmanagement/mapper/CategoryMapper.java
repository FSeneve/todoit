package com.digisene.taskmanagement.mapper;

import com.digisene.taskmanagement.dto.CategoryDto;
import com.digisene.taskmanagement.entity.Category;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    // ENTITY -> DTO
    @Mapping(source = "user.id", target = "userId")
    CategoryDto toDto(Category category);

    // DTO -> ENTITY
    @Mapping(target = "user", ignore = true)
    @Mapping(target = "id", ignore = true)
    Category toEntity(CategoryDto categoryDto);
}

