package com.hexagonal.tareasapp.infrastructure.mapper;

import com.hexagonal.tareasapp.domain.model.Task;
import com.hexagonal.tareasapp.infrastructure.out.entity.ProjectJpaEntity;
import com.hexagonal.tareasapp.infrastructure.out.entity.TaskJpaEntity;

public class TaskMapper {
  public static Task entityToTask(TaskJpaEntity taskJpaEntity){
    return new Task(taskJpaEntity.id,taskJpaEntity.title, taskJpaEntity.description, taskJpaEntity.status, taskJpaEntity.project.id);
  }
  public static TaskJpaEntity taskToEntity(Task task, ProjectJpaEntity projectJpaEntity){
    return new TaskJpaEntity(task.getId(), task.getTitle(),task.getDescription(), task.getStatus(), projectJpaEntity);
  }
}
