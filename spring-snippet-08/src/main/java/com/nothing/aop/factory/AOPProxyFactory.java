package com.nothing.aop.factory;

import com.nothing.aop.aspect.SumServiceAspect;
import com.nothing.aop.service.SumService;
import com.nothing.aop.service.impl.SumServiceImpl;
import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;

/**
 * @author chenliu, create at 12/6/14 20:21
 */
public class AOPProxyFactory {
    public static SumService getSumServiceProxy(){
        SumService sumService = new SumServiceImpl();
        AspectJProxyFactory factory = new AspectJProxyFactory();
        factory.setTarget(sumService);
        factory.addAspect(SumServiceAspect.class);
        return factory.getProxy();
    }
}
