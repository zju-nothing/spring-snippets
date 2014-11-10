package com.nothing.spring.beans;

import junit.framework.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * @author chenliu, create at 11/10/14 23:01
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/snippet-02-config.xml")
public class TestGreeting {
    @Resource
    private Greeting greeting;

    @Test
    public void testGreet(){
//        assertEquals("Hello,Nothing",greeting.greet());
        assertEquals("Hello,TEST",greeting.greet());
    }
}
