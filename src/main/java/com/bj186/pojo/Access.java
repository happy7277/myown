package com.bj186.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Access {
    private Integer accessId;

    private String accessCarcard;

    private Date accessStartdate;

    private Date accessEnddate;

    private BigDecimal accessCost;

    private String accessOther1;

    private String accessOther2;

    public Integer getAccessId() {
        return accessId;
    }

    public void setAccessId(Integer accessId) {
        this.accessId = accessId;
    }

    public String getAccessCarcard() {
        return accessCarcard;
    }

    public void setAccessCarcard(String accessCarcard) {
        this.accessCarcard = accessCarcard == null ? null : accessCarcard.trim();
    }

    public Date getAccessStartdate() {
        return accessStartdate;
    }

    public void setAccessStartdate(Date accessStartdate) {
        this.accessStartdate = accessStartdate;
    }

    public Date getAccessEnddate() {
        return accessEnddate;
    }

    public void setAccessEnddate(Date accessEnddate) {
        this.accessEnddate = accessEnddate;
    }

    public BigDecimal getAccessCost() {
        return accessCost;
    }

    public void setAccessCost(BigDecimal accessCost) {
        this.accessCost = accessCost;
    }

    public String getAccessOther1() {
        return accessOther1;
    }

    public void setAccessOther1(String accessOther1) {
        this.accessOther1 = accessOther1 == null ? null : accessOther1.trim();
    }

    public String getAccessOther2() {
        return accessOther2;
    }

    public void setAccessOther2(String accessOther2) {
        this.accessOther2 = accessOther2 == null ? null : accessOther2.trim();
    }
}