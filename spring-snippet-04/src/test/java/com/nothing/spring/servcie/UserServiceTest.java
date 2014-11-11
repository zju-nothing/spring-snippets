package com.nothing.spring.servcie;

import com.nothing.spring.domain.User;
import com.nothing.spring.service.UserService;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author chenliu, create at 11/11/14 15:40
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring/login-demo-service.xml","/spring/login-test.xml"})
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void testMatchUser() {
        boolean result1 = userService.matchUser("admin", "123456");
        Assert.assertTrue(result1);

        boolean result2 = userService.matchUser("who","111");
        Assert.assertFalse(result2);
    }

    @Test
    public void testFindUserByName(){
        User user = userService.findUserByName("admin");
        Assert.assertNotNull(user);

        User user1 = userService.findUserByName("who");
        Assert.assertNull(user1);
    }
}
