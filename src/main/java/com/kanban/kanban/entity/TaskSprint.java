package com.kanban.kanban.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Task_Sprints")
@EqualsAndHashCode(callSuper = false)
public class TaskSprint {
    @Id
    @Column(columnDefinition = "VARCHAR(255)", name = "id")
    private String id;
    @Column(columnDefinition = "VARCHAR(255)", name = "sprint_id")
    private String sprintId;

    @Column(columnDefinition = "VARCHAR(255)", name = "task_id")
    private String taskId;
}
