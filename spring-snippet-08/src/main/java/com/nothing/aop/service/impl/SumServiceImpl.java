package com.nothing.aop.service.impl;

import com.nothing.aop.service.SumService;

/**
 * @author chenliu, create at 12/6/14 20:01
 */
public class SumServiceImpl implements SumService{
    public long sum(long a, long b) {
        return a+b;
    }
}
