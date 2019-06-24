package com.bj186.pojo;

import java.util.Date;

public class Repair {
    private Integer repairId;

    private Integer repairUid;

    private String repairTitle;

    private Date repairDate;

    private String repairContent;

    private Integer repairState;

    private String repairEva;

    private Integer adminId;

    public Integer getRepairId() {
        return repairId;
    }

    public void setRepairId(Integer repairId) {
        this.repairId = repairId;
    }

    public Integer getRepairUid() {
        return repairUid;
    }

    public void setRepairUid(Integer repairUid) {
        this.repairUid = repairUid;
    }

    public String getRepairTitle() {
        return repairTitle;
    }

    public void setRepairTitle(String repairTitle) {
        this.repairTitle = repairTitle == null ? null : repairTitle.trim();
    }

    public Date getRepairDate() {
        return repairDate;
    }

    public void setRepairDate(Date repairDate) {
        this.repairDate = repairDate;
    }

    public String getRepairContent() {
        return repairContent;
    }

    public void setRepairContent(String repairContent) {
        this.repairContent = repairContent == null ? null : repairContent.trim();
    }

    public Integer getRepairState() {
        return repairState;
    }

    public void setRepairState(Integer repairState) {
        this.repairState = repairState;
    }

    public String getRepairEva() {
        return repairEva;
    }

    public void setRepairEva(String repairEva) {
        this.repairEva = repairEva == null ? null : repairEva.trim();
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }
}