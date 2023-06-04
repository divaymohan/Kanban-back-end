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
@Table(name="Tasks")
@EqualsAndHashCode(callSuper = false)
public class Task {
    @Id
    @Column(columnDefinition = "VARCHAR(255)", name = "task_id")
    private String taskId;
    @Column(columnDefinition = "VARCHAR(255)", name = "title")
    private String title;

    @Column(columnDefinition = "VARCHAR(255)", name = "description")
    private String description;

    @Column(columnDefinition = "VARCHAR(255)", name = "task_type")
    private String taskType;

    @Column(columnDefinition = "VARCHAR(255)", name = "timeline_id")
    private String timelineId;
    @Column(columnDefinition = "INT", name = "story_points")
    private Integer storyPoints;
    @Column(columnDefinition = "VARCHAR(255)", name = "created_by")
    private String createdBy;
    @Column(columnDefinition = "VARCHAR(255)", name = "assigned_to")
    private String assignedTo;
}
