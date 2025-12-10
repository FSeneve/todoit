package com.digisene.taskmanagement.service;

import com.digisene.taskmanagement.dto.UserDtoRequest;
import com.digisene.taskmanagement.dto.UserDtoResponse;
import com.digisene.taskmanagement.dto.UserLoginDtoRequest;

import java.util.List;

public interface UserService {
    UserDtoResponse register(UserDtoRequest userDtoRequest); //Public signup

    UserDtoResponse login(UserLoginDtoRequest userLoginDtoRequest);

    UserDtoResponse updateUser(Long userId, UserDtoRequest userDtoRequest);

    UserDtoResponse createUser(UserDtoRequest userDtoRequest);  //Admin create user

    void deleteUser(Long userId);

    UserDtoResponse getUserById(Long userId);

    List<UserDtoResponse> getAllUsers();
}
