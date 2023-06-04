package com.kanban.kanban.dto;

import com.kanban.kanban.common.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private String userId;
    @NonNull
    private String userName;
    @NonNull
    private String passWord;
    @NonNull
    private Role role;
}
