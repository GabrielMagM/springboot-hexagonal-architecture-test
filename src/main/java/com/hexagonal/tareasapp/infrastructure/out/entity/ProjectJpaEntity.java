package com.hexagonal.tareasapp.infrastructure.out.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="projects")
public class ProjectJpaEntity {
    @Id
    @Column
    public UUID id;

    @Column(nullable = false, unique = true)
    public String name;

    @Column
    public String description;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "owner_id", nullable = false)
    public UserJpaEntity owner;

    public ProjectJpaEntity() {
    }

    public ProjectJpaEntity(UUID id, String name, String description, UserJpaEntity owner) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.owner = owner;
    }

    
}
