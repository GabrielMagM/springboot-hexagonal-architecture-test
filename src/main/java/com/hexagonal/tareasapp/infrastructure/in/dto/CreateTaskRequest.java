package com.hexagonal.tareasapp.infrastructure.in.dto;

import java.util.UUID;

import com.hexagonal.tareasapp.domain.enums.Status;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class CreateTaskRequest {
  @NotBlank(message = "el titulo no puede estar vacio")
  public String title;
  @NotBlank(message = "el campo descripcion no puede estar vacio")
  public String description;
  @NotNull(message = "el project_id no puede estar vacio")
  public UUID project_id;
  public CreateTaskRequest(UUID id, String title, String description, Status status, UUID project_id) {
    this.title = title;
    this.description = description;
    this.project_id = project_id;
  }

}
