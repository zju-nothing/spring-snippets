package com.nothing.tag.service.dao;

import com.nothing.tag.service.dataobject.BoolTagDO;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author chenliu, create at 11/25/14 12:27
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/spring/root-context-test.xml")
public class BoolTagDaoTest {

    @Autowired
    private BoolTagDao boolTagDao;

    @Test
    public void testBoolTagDao() {
        BoolTagDO boolTagDO = boolTagDao.getBoolTagDO(123L);
        long tagValue = boolTagDO.getTag1();
        Assert.assertEquals(100L, tagValue);

    }
}
