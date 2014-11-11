package com.nothing.spring.dao;


import com.nothing.spring.domain.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;

import javax.annotation.Nullable;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author chenliu, create at 9/17/14 14:42
 */
public class UserDao {
    private JdbcTemplate jdbcTemplate;

    public int getMatchUser(String userName, String password) {
        String sqlStr = "select count(*) from t_user where user_name=? and password=?";
        return jdbcTemplate.queryForInt(sqlStr, userName, password);
    }

    @Nullable
    public User findUserByName(final String userName) {
        final User user = new User();
        String sqlStr = "select user_id,user_name,credits from t_user where user_name=?";
        jdbcTemplate.query(sqlStr, new Object[]{userName}, new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet resultSet) throws SQLException {
                user.setUserId(resultSet.getInt("user_id"));
                user.setCredits(resultSet.getInt("credits"));
                user.setUserName(userName);
            }
        });
        if (user.getUserName() == null) return null;
        return user;
    }

    public void updateLoginInfo(User user) {
        String sqlStr = "Update t_user SET last_visit=?,last_ip=?,credits=? where user_id=?";
        jdbcTemplate.update(sqlStr, user.getLastVisit(), user.getLastIp(), user.getCredits(), user.getUserId());
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}