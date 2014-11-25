package com.nothing.user.dao;

import com.nothing.user.dataobject.User;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author chenliu, create at 11/24/14 22:21
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/spring/root-context.xml")
public class UserDaoTest {
    @Autowired
    private UserDao userDao;

    @Test
    public void testInitUser() {
        User user = new User("George", 28);
        userDao.initUser(user);
    }

    @Test
    public void testFindUserById() {
        User user = userDao.findUserById(2);
        Assert.assertEquals(28, user.getAge());
    }
}
