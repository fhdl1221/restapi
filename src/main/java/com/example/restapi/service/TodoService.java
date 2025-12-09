package com.example.restapi.service;

import com.example.restapi.dto.request.TodoCreateRequest;
import com.example.restapi.dto.response.TodoResponse;
import com.example.restapi.security.CustomUserDetails;
import jakarta.validation.Valid;

import java.util.List;

public interface TodoService {
    TodoResponse create(TodoCreateRequest request, String username);

    List<TodoResponse> findAll();

    TodoResponse findById(Long id);

    void delete(Long id);

    TodoResponse update(Long id, TodoCreateRequest request);
}
