package com.hexagonal.tareasapp.infrastructure.in.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexagonal.tareasapp.domain.model.Task;
import com.hexagonal.tareasapp.domain.port.in.TaskUseCase;
import com.hexagonal.tareasapp.infrastructure.in.dto.CreateTaskRequest;

import jakarta.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RequestMapping("/task")
@RestController
public class TaskController {
  
  private final TaskUseCase taskUseCase;

  public TaskController(TaskUseCase taskUseCase) {
    this.taskUseCase = taskUseCase;
  }
  @PostMapping("/create")
  public ResponseEntity<?> createTask(@Valid @RequestBody CreateTaskRequest request) {
    Task task = taskUseCase.create(request.title, request.description, request.project_id);
      return new ResponseEntity<>(task, HttpStatus.CREATED);
  }
}
