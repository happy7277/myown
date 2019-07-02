package com.bj186.pojo;

import java.util.Date;

public class Park {
    private Integer parkId;

    private Integer parkUid;

    private String parkLocal;

    private String parkPrice;

    private Date parkSaledate;



    public Date getParkSaledate() {
        return parkSaledate;
    }

    public void setParkSaledate(Date parkSaledate) {
        this.parkSaledate = parkSaledate;
    }

    public Integer getParkId() {
        return parkId;
    }

    public void setParkId(Integer parkId) {
        this.parkId = parkId;
    }

    public Integer getParkUid() {
        return parkUid;
    }

    public void setParkUid(Integer parkUid) {
        this.parkUid = parkUid;
    }

    public String getParkLocal() {
        return parkLocal;
    }

    public void setParkLocal(String parkLocal) {
        this.parkLocal = parkLocal == null ? null : parkLocal.trim();
    }

    public String getParkPrice() {
        return parkPrice;
    }

    public void setParkPrice(String parkPrice) {
        this.parkPrice = parkPrice == null ? null : parkPrice.trim();
    }


}