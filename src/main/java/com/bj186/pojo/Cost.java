package com.bj186.pojo;

import java.util.Date;

public class Cost {
    private Integer costId;

    private String costEater;

    private String costGas;

    private String costPower;

    private String costAir;

    private String costOther;

    private Date costDate;

    private Integer costAtate;

    private Integer costUid;

    public Integer getCostId() {
        return costId;
    }

    public void setCostId(Integer costId) {
        this.costId = costId;
    }

    public String getCostEater() {
        return costEater;
    }

    public void setCostEater(String costEater) {
        this.costEater = costEater == null ? null : costEater.trim();
    }

    public String getCostGas() {
        return costGas;
    }

    public void setCostGas(String costGas) {
        this.costGas = costGas == null ? null : costGas.trim();
    }

    public String getCostPower() {
        return costPower;
    }

    public void setCostPower(String costPower) {
        this.costPower = costPower == null ? null : costPower.trim();
    }

    public String getCostAir() {
        return costAir;
    }

    public void setCostAir(String costAir) {
        this.costAir = costAir == null ? null : costAir.trim();
    }

    public String getCostOther() {
        return costOther;
    }

    public void setCostOther(String costOther) {
        this.costOther = costOther == null ? null : costOther.trim();
    }

    public Date getCostDate() {
        return costDate;
    }

    public void setCostDate(Date costDate) {
        this.costDate = costDate;
    }

    public Integer getCostAtate() {
        return costAtate;
    }

    public void setCostAtate(Integer costAtate) {
        this.costAtate = costAtate;
    }

    public Integer getCostUid() {
        return costUid;
    }

    public void setCostUid(Integer costUid) {
        this.costUid = costUid;
    }
}