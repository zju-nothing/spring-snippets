package com.nothing.user.dao.impl;

import com.nothing.user.dao.UserDao;
import com.nothing.user.dataobject.User;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

/**
 * @author chenliu, create at 11/24/14 22:02
 */
public class UserDaoImpl extends SqlMapClientDaoSupport implements UserDao {

    public void initUser(User user) {
        //Use the sqlMapClientTemplate instead of sqlMapClient to avoid deal with exceptions.
        //See http://docs.spring.io/spring-framework/docs/3.2.10.RELEASE/spring-framework-reference/html/orm.html#orm-ibatis
        getSqlMapClientTemplate().update("UserMapper.initUser", user);
    }

    public User findUserById(long id) {
        return (User) getSqlMapClientTemplate().queryForObject("UserMapper.findUserById",id);
    }
}
