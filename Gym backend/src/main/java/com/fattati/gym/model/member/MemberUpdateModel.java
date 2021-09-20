package com.fattati.gym.model.member;

import lombok.Data;

@Data
public class MemberUpdateModel {
    private String memberId;
    private String userId;
    private String firstName;
    private String lastName;
    private int age;
    private String userStatus;
    private String trainer;
}
