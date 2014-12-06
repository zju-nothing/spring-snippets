package com.nothing.aop.aspect;

import com.nothing.aop.service.SumService;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author chenliu, create at 12/6/14 20:03
 */
@Aspect
public class SumServiceAspect {
    private SumService target;

    @Before("execution(* sum(..))")
    public void beforeSum() {
        long startTime = System.currentTimeMillis();
        System.out.println("startTime -> " + startTime);
    }

    @After("execution(* sum(..))")
    public void afterSum() {
        long afterTime = System.currentTimeMillis();
        System.out.println("afterTime -> " + afterTime);
    }
}
