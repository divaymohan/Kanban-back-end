package com.kanban.kanban.repositories;

import com.kanban.kanban.entity.TaskSprint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskSprintRepository extends JpaRepository<TaskSprint, String> {
}
