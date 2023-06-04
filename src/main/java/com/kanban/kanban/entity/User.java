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
@Table(name="User")
@EqualsAndHashCode(callSuper = false)
public class User {
    @Id
    @Column(columnDefinition = "VARCHAR(255)", name = "user_id")
    private String userId;
    @Column(columnDefinition = "VARCHAR(255)", name = "username")
    private String userName;
    @Column(columnDefinition = "VARCHAR(255)", name = "password")
    private String passWord;
    @Column(columnDefinition = "VARCHAR(255)", name = "role")
    private String role;
}
