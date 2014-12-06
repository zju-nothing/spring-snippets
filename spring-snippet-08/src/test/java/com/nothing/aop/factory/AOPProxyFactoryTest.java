package com.nothing.aop.factory;

import com.nothing.aop.service.SumService;
import org.aspectj.lang.annotation.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author chenliu, create at 12/6/14 20:26
 */

public class AOPProxyFactoryTest {
    @Test
    public void testProxy(){
        //Enhanced by cglib but not default jdk-delegate.
        SumService service = AOPProxyFactory.getSumServiceProxy();
        System.out.println(service.getClass().getName());
        service.sum(1234L,5678L);
    }
}
