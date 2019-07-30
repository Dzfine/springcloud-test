package com.example.service_provider.entity;

public class User {

    private int userId;

    private String userName;

    private String userSex;

    private long userSalary;

    public User() {}

    public User(int userId, String userName, String userSex, long userSalary) {
        this.userId = userId;
        this.userName = userName;
        this.userSex = userSex;
        this.userSalary = userSalary;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public long getUserSalary() {
        return userSalary;
    }

    public void setUserSalary(long userSalary) {
        this.userSalary = userSalary;
    }
}
