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
@Table(name="Tags")
@EqualsAndHashCode(callSuper = false)
public class Tag {
    @Id
    @Column(columnDefinition = "VARCHAR(255)", name = "tag_id")
    private String tagId;
    @Column(columnDefinition = "VARCHAR(255)", name = "tag_name")
    private String tagName;
}
