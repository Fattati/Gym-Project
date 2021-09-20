package com.fattati.gym.model.notification;


import com.fattati.gym.domain.User;

public class VerifyEmailNotification {

    private String email;
    private String userToken;
    private User user;


    public VerifyEmailNotification(){}

    public VerifyEmailNotification(String email, String userToken){
        this.email = email;
        this.userToken = userToken;

    }

    public VerifyEmailNotification(String email, String userToken, User user){
        this.email = email;
        this.userToken = userToken;
        this.user = user;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserToken() {
        return userToken;
    }

    public void setUserToken(String userToken) {
        this.userToken = userToken;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
