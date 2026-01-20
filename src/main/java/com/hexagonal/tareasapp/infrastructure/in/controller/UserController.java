package com.hexagonal.tareasapp.infrastructure.in.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hexagonal.tareasapp.domain.model.User;
import com.hexagonal.tareasapp.domain.port.in.CreateUserUseCase;
import com.hexagonal.tareasapp.infrastructure.in.dto.CreateUserRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RequestMapping("/user")
@RestController
public class UserController {

  private final CreateUserUseCase createUserUseCase;

  public UserController(CreateUserUseCase createUserUseCase) {
    this.createUserUseCase = createUserUseCase;
  }

  @PostMapping("create")
  public ResponseEntity<User> createUser(@RequestBody CreateUserRequest request) {
    System.out.println("Request received - Name: " + request.name() + ", Email: " + request.email());
    User user = createUserUseCase.create(request.name(), request.email());
    return new ResponseEntity<>(user, HttpStatus.CREATED);
  }

}
