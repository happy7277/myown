package com.bj186.pojo;

public class User {
    private Integer userId;

    private String userName;

    private String userPassword;

    private String userPhonenumber;

    private String userDress;

    private String userSise;

    private Integer userType;

    private String auth;

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userPhonenumber='" + userPhonenumber + '\'' +
                ", userDress='" + userDress + '\'' +
                ", userSise='" + userSise + '\'' +
                ", userType=" + userType +
                ", auth='" + auth + '\'' +
                '}';
    }

    public User(String userPhonenumber) {
        this.userPhonenumber = userPhonenumber;
    }

    public User() {
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserPhonenuber() {
        return userPhonenumber;
    }

    public void setUserPhonenuber(String userPhonenuber) {
        this.userPhonenumber = userPhonenuber == null ? null : userPhonenuber.trim();
    }

    public String getUserDress() {
        return userDress;
    }

    public void setUserDress(String userDress) {
        this.userDress = userDress == null ? null : userDress.trim();
    }

    public String getUserSise() {
        return userSise;
    }

    public void setUserSise(String userSise) {
        this.userSise = userSise == null ? null : userSise.trim();
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }
}