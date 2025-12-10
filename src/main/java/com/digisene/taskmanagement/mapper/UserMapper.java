package com.digisene.taskmanagement.mapper;

import com.digisene.taskmanagement.dto.UserDtoRequest;
import com.digisene.taskmanagement.dto.UserDtoResponse;
import com.digisene.taskmanagement.entity.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {

    UserDtoResponse toDto(User user);

    User toEntity(UserDtoRequest userDtoRequest);
}
