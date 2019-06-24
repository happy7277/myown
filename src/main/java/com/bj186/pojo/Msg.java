package com.bj186.pojo;

import java.util.Date;

public class Msg {
    private Integer msgId;

    private String msgTitle;

    private Date msgPartstarttime;

    private Date msgPartendtime;

    private Date msgCreatetime;

    private Integer msgPartstate;

    private String msgAdmin;

    private Integer msgClass;

    private String msgOther1;

    private String msgOther2;

    private String msgOther3;

    public Integer getMsgId() {
        return msgId;
    }

    public void setMsgId(Integer msgId) {
        this.msgId = msgId;
    }

    public String getMsgTitle() {
        return msgTitle;
    }

    public void setMsgTitle(String msgTitle) {
        this.msgTitle = msgTitle == null ? null : msgTitle.trim();
    }

    public Date getMsgPartstarttime() {
        return msgPartstarttime;
    }

    public void setMsgPartstarttime(Date msgPartstarttime) {
        this.msgPartstarttime = msgPartstarttime;
    }

    public Date getMsgPartendtime() {
        return msgPartendtime;
    }

    public void setMsgPartendtime(Date msgPartendtime) {
        this.msgPartendtime = msgPartendtime;
    }

    public Date getMsgCreatetime() {
        return msgCreatetime;
    }

    public void setMsgCreatetime(Date msgCreatetime) {
        this.msgCreatetime = msgCreatetime;
    }

    public Integer getMsgPartstate() {
        return msgPartstate;
    }

    public void setMsgPartstate(Integer msgPartstate) {
        this.msgPartstate = msgPartstate;
    }

    public String getMsgAdmin() {
        return msgAdmin;
    }

    public void setMsgAdmin(String msgAdmin) {
        this.msgAdmin = msgAdmin == null ? null : msgAdmin.trim();
    }

    public Integer getMsgClass() {
        return msgClass;
    }

    public void setMsgClass(Integer msgClass) {
        this.msgClass = msgClass;
    }

    public String getMsgOther1() {
        return msgOther1;
    }

    public void setMsgOther1(String msgOther1) {
        this.msgOther1 = msgOther1 == null ? null : msgOther1.trim();
    }

    public String getMsgOther2() {
        return msgOther2;
    }

    public void setMsgOther2(String msgOther2) {
        this.msgOther2 = msgOther2 == null ? null : msgOther2.trim();
    }

    public String getMsgOther3() {
        return msgOther3;
    }

    public void setMsgOther3(String msgOther3) {
        this.msgOther3 = msgOther3 == null ? null : msgOther3.trim();
    }
}