package com.icbt.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private int userId;
    private String userName;
    private String email;
    private String password;
    private String phoneNumber;
    private int roleId;
}
