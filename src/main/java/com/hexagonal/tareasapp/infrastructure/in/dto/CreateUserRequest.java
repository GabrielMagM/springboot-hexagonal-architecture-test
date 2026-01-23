package com.hexagonal.tareasapp.infrastructure.in.dto;

public record CreateUserRequest(
    String name,
    String email) {
}
