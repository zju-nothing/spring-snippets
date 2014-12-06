package com.nothing.aop.spring;

import com.nothing.aop.service.SumService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author chenliu, create at 12/6/14 20:56
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/root-context.xml")
public class AOPWithSpringFactory {

    @Autowired
    private SumService sumService;

    @Test
    public void testProxy(){
        //The proxy was provided by JDB dynamic proxy by default.
        System.out.println(sumService.getClass().getName());
        sumService.sum(100,200);
    }
}
