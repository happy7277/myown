package com.bj186.pojo;

import java.util.Date;

public class MsgCount {
    private Integer msgcountId;

    private Integer msgcountPid;

    private Integer msgcountUid;

    private Date msgcountReadtime;

    public Integer getMsgcountId() {
        return msgcountId;
    }

    public void setMsgcountId(Integer msgcountId) {
        this.msgcountId = msgcountId;
    }

    public Integer getMsgcountPid() {
        return msgcountPid;
    }

    public void setMsgcountPid(Integer msgcountPid) {
        this.msgcountPid = msgcountPid;
    }

    public Integer getMsgcountUid() {
        return msgcountUid;
    }

    public void setMsgcountUid(Integer msgcountUid) {
        this.msgcountUid = msgcountUid;
    }

    public Date getMsgcountReadtime() {
        return msgcountReadtime;
    }

    public void setMsgcountReadtime(Date msgcountReadtime) {
        this.msgcountReadtime = msgcountReadtime;
    }
}