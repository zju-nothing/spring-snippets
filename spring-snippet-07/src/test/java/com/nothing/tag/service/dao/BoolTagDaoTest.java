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
    public void testEnableSeat() {
        boolTagDao.enableSeat(123L, "Tag1", 10);
        boolTagDao.enableSeat(123L, "Tag1", 5);
        BoolTagDO boolTagDO = boolTagDao.getBoolTagDO(123L);
        Assert.assertEquals(Long.valueOf(1024 + 32), boolTagDO.getTag1());
    }

    @Test
    public void testDisableSeat() {
        boolTagDao.disableSeat(123L, "Tag1", 5);
        BoolTagDO boolTagDO = boolTagDao.getBoolTagDO(123L);
        Assert.assertEquals(Long.valueOf(1024), boolTagDO.getTag1());
    }


    @Test
    public void testEnableSeat_V1() {
        for (int i = 0; i < 16; i++) {
            boolTagDao.enableSeat(123L, "Tag1", i);
        }

        BoolTagDO boolTagDO = boolTagDao.getBoolTagDO(123L);
        Assert.assertEquals(Long.valueOf(65535), boolTagDO.getTag1());
    }

    @Test
    public void testEnableSeat_V2() {
        for (int i = 0; i < 16; i++) {
            long value = 1 << i;
            boolTagDao.addTagValue(123L, "Tag1", value);
        }
        long endTime = System.currentTimeMillis();

        BoolTagDO boolTagDO = boolTagDao.getBoolTagDO(123L);
        Assert.assertEquals(Long.valueOf(65535), boolTagDO.getTag1());
    }


    @Test
    public void testEnableSeat_V3() {
        for (int i = 0; i < 16; i++) {
            long value = 1 << i;
            boolTagDao.setTagValue(123L, "Tag1", value);
        }

        BoolTagDO boolTagDO = boolTagDao.getBoolTagDO(123L);
        Assert.assertEquals(Long.valueOf(32768), boolTagDO.getTag1());
    }

}
