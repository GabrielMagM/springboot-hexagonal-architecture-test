package com.hexagonal.tareasapp.domain.port.in;

import java.util.UUID;

public interface CreateUserUseCase {

  public UUID create(UUID id, String name, String email);
}
