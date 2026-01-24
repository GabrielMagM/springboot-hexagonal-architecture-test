package com.hexagonal.tareasapp.application.service;
import java.util.UUID;
import org.springframework.stereotype.Service;
import com.hexagonal.tareasapp.domain.model.Project;
import com.hexagonal.tareasapp.domain.port.in.ProjectUseCase;
import com.hexagonal.tareasapp.domain.port.out.ProjectRepositoryPort;

@Service
public class ProjectService implements ProjectUseCase {

    private final ProjectRepositoryPort projectRepo;

    public ProjectService(ProjectRepositoryPort projectRepo) {
        this.projectRepo = projectRepo;
    }

    @Override
    public Project create(String name, String description, UUID ownerId) {
        Project project = new Project(name, description, ownerId);
        return projectRepo.save(project);
    }
}