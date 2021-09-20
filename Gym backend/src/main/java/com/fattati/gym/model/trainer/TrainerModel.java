package com.fattati.gym.model.trainer;

import com.fattati.gym.domain.Trainer;
import com.fattati.gym.domain.User;
import com.fattati.gym.enums.UserRole;
import com.fattati.gym.enums.UserStatus;
import lombok.Data;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.List;
import java.util.UUID;

@Data
public class TrainerModel {
    private String trainerId;
    private String userId;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private List<String> assignedMembers;
    private UserStatus userStatus;
    private UserRole role;

}
