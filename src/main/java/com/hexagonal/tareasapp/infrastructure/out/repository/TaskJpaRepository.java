package com.hexagonal.tareasapp.infrastructure.out.repository;
import com.hexagonal.tareasapp.infrastructure.out.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface TaskJpaRepository extends JpaRepository<TaskJpaEntity, UUID>{}
