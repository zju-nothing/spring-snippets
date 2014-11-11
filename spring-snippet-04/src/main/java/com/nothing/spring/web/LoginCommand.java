package com.nothing.spring.web;

/**
 * @author chenliu, create at 9/17/14 20:24
 */
public class LoginCommand {
    private String userName;
    private String password;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
