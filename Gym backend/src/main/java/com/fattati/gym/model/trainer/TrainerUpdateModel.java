package com.fattati.gym.model.trainer;

import com.fattati.gym.enums.UserRole;
import com.fattati.gym.enums.UserStatus;
import lombok.Data;

import java.util.List;

@Data
public class TrainerUpdateModel {
    private String trainerId;
    private String userId;
    private String firstName;
    private String lastName;
    private int age;
    private UserStatus userStatus;
}
