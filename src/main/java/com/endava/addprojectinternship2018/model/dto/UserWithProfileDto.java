package com.endava.addprojectinternship2018.model.dto;

import com.endava.addprojectinternship2018.model.Role;
import com.endava.addprojectinternship2018.model.UserStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserWithProfileDto {

    private Role role;
    private String name;
    private String username;
    private String email;
    private UserStatus userStatus;
}
