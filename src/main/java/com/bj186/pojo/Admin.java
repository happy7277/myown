package com.bj186.pojo;

import java.util.Date;

public class Admin {
    private Integer adminId;

    private String adminName;

    private String adminPassword;

    private Integer adminPhonenumber;

    private String adminPost;

    private String adminPower;

    private String adminSalary;

    private Date adminDate;

    private Integer adminStatus;

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword == null ? null : adminPassword.trim();
    }

    public Integer getAdminPhonenumber() {
        return adminPhonenumber;
    }

    public void setAdminPhonenumber(Integer adminPhonenumber) {
        this.adminPhonenumber = adminPhonenumber;
    }

    public String getAdminPost() {
        return adminPost;
    }

    public void setAdminPost(String adminPost) {
        this.adminPost = adminPost == null ? null : adminPost.trim();
    }

    public String getAdminPower() {
        return adminPower;
    }

    public void setAdminPower(String adminPower) {
        this.adminPower = adminPower == null ? null : adminPower.trim();
    }

    public String getAdminSalary() {
        return adminSalary;
    }

    public void setAdminSalary(String adminSalary) {
        this.adminSalary = adminSalary == null ? null : adminSalary.trim();
    }

    public Date getAdminDate() {
        return adminDate;
    }

    public void setAdminDate(Date adminDate) {
        this.adminDate = adminDate;
    }

    public Integer getAdminStatus() {
        return adminStatus;
    }

    public void setAdminStatus(Integer adminStatus) {
        this.adminStatus = adminStatus;
    }
}