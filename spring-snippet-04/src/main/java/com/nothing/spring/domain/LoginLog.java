package com.nothing.spring.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author chenliu, create at 9/17/14 14:39
 */
public class LoginLog implements Serializable {
    private int id;
    private int userId;
    private String ip;
    private Date loginDate;

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public int getUserId() {
        return userId;
    }
}
