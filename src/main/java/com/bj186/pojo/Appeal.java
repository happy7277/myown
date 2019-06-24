package com.bj186.pojo;

import java.util.Date;

public class Appeal {
    private Integer appealId;

    private Integer appealUid;

    private String appealTitle;

    private Date appealDate;

    private String appealContent;

    private Integer appealState;

    private Integer adminId;

    private String appealEva;

    public Integer getAppealId() {
        return appealId;
    }

    public void setAppealId(Integer appealId) {
        this.appealId = appealId;
    }

    public Integer getAppealUid() {
        return appealUid;
    }

    public void setAppealUid(Integer appealUid) {
        this.appealUid = appealUid;
    }

    public String getAppealTitle() {
        return appealTitle;
    }

    public void setAppealTitle(String appealTitle) {
        this.appealTitle = appealTitle == null ? null : appealTitle.trim();
    }

    public Date getAppealDate() {
        return appealDate;
    }

    public void setAppealDate(Date appealDate) {
        this.appealDate = appealDate;
    }

    public String getAppealContent() {
        return appealContent;
    }

    public void setAppealContent(String appealContent) {
        this.appealContent = appealContent == null ? null : appealContent.trim();
    }

    public Integer getAppealState() {
        return appealState;
    }

    public void setAppealState(Integer appealState) {
        this.appealState = appealState;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAppealEva() {
        return appealEva;
    }

    public void setAppealEva(String appealEva) {
        this.appealEva = appealEva == null ? null : appealEva.trim();
    }
}