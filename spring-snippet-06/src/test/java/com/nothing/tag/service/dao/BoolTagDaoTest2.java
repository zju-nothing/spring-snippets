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
@ContextConfiguration(locations = {"/spring/root-context-test.xml", "/spring/dal/datasource-2.xml"})
public class BoolTagDaoTest2 {

    @Autowired
    private BoolTagDao boolTagDao;


    @Test
    public void getTagValue_dependOnTestData1_ReturnTag1Value() {
        BoolTagDO boolTagDO = boolTagDao.getBoolTagDO(123L);
        Long tag1Value = boolTagDO.getTag1();
        Long TAG1_FROM_TEST_DATA_2 = 2048L;
        Assert.assertEquals(Long.valueOf(tag1Value), TAG1_FROM_TEST_DATA_2);
    }


}
