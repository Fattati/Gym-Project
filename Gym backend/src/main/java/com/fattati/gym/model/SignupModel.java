package com.fattati.gym.model;

import com.fattati.gym.enums.UserRole;
import com.fattati.gym.enums.UserStatus;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class SignupModel implements Serializable{
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private int age;
    private UserRole role;
}
