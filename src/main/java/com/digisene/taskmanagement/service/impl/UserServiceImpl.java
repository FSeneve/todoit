package com.digisene.taskmanagement.service.impl;

import com.digisene.taskmanagement.dto.UserDtoRequest;
import com.digisene.taskmanagement.dto.UserDtoResponse;
import com.digisene.taskmanagement.dto.UserLoginDtoRequest;
import com.digisene.taskmanagement.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public UserDtoResponse register(UserDtoRequest userDtoRequest) {
        return null;
    }

    @Override
    public UserDtoResponse login(UserLoginDtoRequest userLoginDtoRequest) {
        return null;
    }

    @Override
    public UserDtoResponse updateUser(Long userId, UserDtoRequest userDtoRequest) {
        return null;
    }

    @Override
    public UserDtoResponse createUser(UserDtoRequest userDtoRequest) {
        return null;
    }

    @Override
    public void deleteUser(Long userId) {

    }

    @Override
    public UserDtoResponse getUserById(Long userId) {
        return null;
    }

    @Override
    public List<UserDtoResponse> getAllUsers() {
        return List.of();
    }
}
