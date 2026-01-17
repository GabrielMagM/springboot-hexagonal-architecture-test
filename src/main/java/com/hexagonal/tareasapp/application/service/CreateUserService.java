package com.hexagonal.tareasapp.application.service;
import java.util.UUID;
import com.hexagonal.tareasapp.domain.model.User;
import com.hexagonal.tareasapp.domain.port.in.CreateUserUseCase;
public class CreateUserService implements CreateUserUseCase {

  @Override
  public UUID create(UUID id, String name, String email) {
      User user = new User(id, name, email);
      return user.getId();
  }

}