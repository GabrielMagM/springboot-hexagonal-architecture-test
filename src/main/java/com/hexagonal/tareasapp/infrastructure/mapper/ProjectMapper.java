package com.hexagonal.tareasapp.infrastructure.mapper;
import com.hexagonal.tareasapp.domain.model.Project;
import com.hexagonal.tareasapp.infrastructure.out.entity.ProjectJpaEntity;
import com.hexagonal.tareasapp.infrastructure.out.entity.UserJpaEntity;

public class ProjectMapper {
    
    public static Project entityToProject(ProjectJpaEntity projectJpaEntity){
        System.out.println(projectJpaEntity.owner.id);
        return new Project(projectJpaEntity.id, projectJpaEntity.name, projectJpaEntity.description, projectJpaEntity.owner.id);
    }

    public static ProjectJpaEntity projectToJpaEntity(Project project, UserJpaEntity owner){
        ProjectJpaEntity entity = new ProjectJpaEntity();
        entity.id = project.getId();
        entity.name = project.getName();
        entity.description = project.getDescription();
        entity.owner = owner;

        return entity;
    }

}
