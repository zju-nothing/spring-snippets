package com.nothing.spring.dao;

import com.nothing.spring.domain.LoginLog;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author chenliu, create at 9/17/14 15:50
 */
public class LoginLogDao {
    private JdbcTemplate jdbcTemplate;

    public void insertLoginLog(LoginLog loginLog) {
        String sqlStr = "insert into t_login_log set user_id=?,ip=?,login_time=?";
        jdbcTemplate.update(sqlStr, loginLog.getUserId(),loginLog.getIp(),loginLog.getLoginDate());
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
