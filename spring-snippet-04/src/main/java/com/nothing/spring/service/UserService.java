package com.nothing.spring.service;


import com.nothing.spring.dao.LoginLogDao;
import com.nothing.spring.dao.UserDao;
import com.nothing.spring.domain.LoginLog;
import com.nothing.spring.domain.User;

/**
 * @author chenliu, create at 9/17/14 16:10
 */
public class UserService {
    private UserDao userDao;
    private LoginLogDao loginLogDao;

    public boolean matchUser(String userName, String password) {
        return userDao.getMatchUser(userName, password) > 0;
    }


    public User findUserByName(String userName) {
        return userDao.findUserByName(userName);
    }

    public void loginSuccess(User user) {
        user.setCredits(user.getCredits() + 5);
        userDao.updateLoginInfo(user);
        LoginLog loginLog = new LoginLog();
        loginLog.setUserId(user.getUserId());
        loginLog.setIp(user.getLastIp());
        loginLog.setLoginDate(user.getLastVisit());
        loginLogDao.insertLoginLog(loginLog);
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setLoginLogDao(LoginLogDao loginLogDao) {
        this.loginLogDao = loginLogDao;
    }

}
