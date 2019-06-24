package com.bj186.pojo;

import java.util.Date;

public class Pay {
    private Integer payId;

    private String payCostid;

    private Date payDate;

    private Integer payWay;

    public Integer getPayId() {
        return payId;
    }

    public void setPayId(Integer payId) {
        this.payId = payId;
    }

    public String getPayCostid() {
        return payCostid;
    }

    public void setPayCostid(String payCostid) {
        this.payCostid = payCostid == null ? null : payCostid.trim();
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public Integer getPayWay() {
        return payWay;
    }

    public void setPayWay(Integer payWay) {
        this.payWay = payWay;
    }
}