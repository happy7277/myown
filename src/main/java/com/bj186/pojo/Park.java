package com.bj186.pojo;

public class Park {
    private Integer parkId;

    private Integer parkUid;

    private String parkLocal;

    private String parkPrice;

    private String parkSaledate;

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

    public String getParkSaledate() {
        return parkSaledate;
    }

    public void setParkSaledate(String parkSaledate) {
        this.parkSaledate = parkSaledate == null ? null : parkSaledate.trim();
    }
}