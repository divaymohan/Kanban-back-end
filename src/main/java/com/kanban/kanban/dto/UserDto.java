package com.kanban.kanban.dto;

import com.kanban.kanban.common.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private String userId;
    @NotBlank(message = "User name is required")
    private String userName;
    @NotBlank(message = "Password is required")
    private String passWord;
    @NotBlank(message = "Role is required")
    private Role role;
}
