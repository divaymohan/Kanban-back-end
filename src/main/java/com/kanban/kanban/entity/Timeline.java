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
@Table(name="Timelines")
@EqualsAndHashCode(callSuper = false)
public class Timeline {
    @Id
    @Column(columnDefinition = "VARCHAR(255)", name = "timeline_id")
    private String timelineId;
    @Column(columnDefinition = "VARCHAR(255)", name = "timeline_name")
    private String timelineName;
}
