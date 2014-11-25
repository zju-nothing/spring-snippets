package com.nothing.user.dao;

import com.nothing.user.dataobject.User;

/**
 * @author chenliu, create at 11/24/14 21:04
 */
public interface UserDao {
   void initUser(User user);
   User findUserById(long id);
}
