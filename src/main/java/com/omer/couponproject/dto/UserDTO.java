package com.omer.couponproject.dto;

import com.omer.couponproject.enums.tables.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private long id;
    private String name;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Role role;

    public UserDTO(long id,String email, Role role) {
        this.id = id;
        this.email = email;
        this.role = role;
    }

    public UserDTO(long id,String email,String name,Role role) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.role = role;
    }

    public UserDTO(long id,String email,String firstName, String lastName, Role role) {
        this.id = id;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }

}


