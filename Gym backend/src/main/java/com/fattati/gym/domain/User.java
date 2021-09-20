package com.fattati.gym.domain;

import com.fattati.gym.enums.UserRole;
import com.fattati.gym.enums.UserStatus;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
public class User {
    @Id
    @org.hibernate.annotations.Type(type="uuid-char")
    private UUID id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    @Enumerated(EnumType.STRING)
    private UserStatus userStatus;

    @Enumerated(EnumType.STRING)
    private UserRole role;

    public User() {
        this.id = UUID.randomUUID();
    }
}
