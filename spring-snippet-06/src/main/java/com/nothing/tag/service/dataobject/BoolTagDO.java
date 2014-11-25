package com.nothing.tag.service.dataobject;

import java.io.Serializable;
import java.util.Date;

/**
 * @author chenliu, create at 11/25/14 11:25
 */
public class BoolTagDO implements Serializable{
    private static final long serialVersionUID = 2724305584536821320L;
    /**
     * Primary key, id of an account
     */
    private Long accountId;
    private Long tag1;
    private Long tag2;
    private Long tag3;
    private Long tag4;
    private Long tag5;
    private Long tag6;
    private Long tag7;
    private Date gmtCreate;
    private Date gmtModified;

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Long getTag1() {
        return tag1;
    }

    public void setTag1(Long tag1) {
        this.tag1 = tag1;
    }

    public Long getTag2() {
        return tag2;
    }

    public void setTag2(Long tag2) {
        this.tag2 = tag2;
    }

    public Long getTag3() {
        return tag3;
    }

    public void setTag3(Long tag3) {
        this.tag3 = tag3;
    }

    public Long getTag4() {
        return tag4;
    }

    public void setTag4(Long tag4) {
        this.tag4 = tag4;
    }

    public Long getTag5() {
        return tag5;
    }

    public void setTag5(Long tag5) {
        this.tag5 = tag5;
    }

    public Long getTag6() {
        return tag6;
    }

    public void setTag6(Long tag6) {
        this.tag6 = tag6;
    }

    public Long getTag7() {
        return tag7;
    }

    public void setTag7(Long tag7) {
        this.tag7 = tag7;
    }
}
