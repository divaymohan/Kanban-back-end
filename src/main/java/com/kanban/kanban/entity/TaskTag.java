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
@Table(name="Task_Tags")
@EqualsAndHashCode(callSuper = false)
public class TaskTag {
    @Id
    @Column(columnDefinition = "VARCHAR(255)", name = "id")
    private String id;
    @Column(columnDefinition = "VARCHAR(255)", name = "tag_id")
    private String tagId;
    @Column(columnDefinition = "VARCHAR(255)", name = "task_id")
    private String taskId;
}
