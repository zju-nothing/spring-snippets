package com.nothing.tag.service.dao;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author chenliu, create at 11/25/14 12:27
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/spring/root-context.xml")
public class BoolTagDaoTest {
    private EmbeddedDatabase db;
    @Autowired
    private BoolTagDao boolTagDao;

    @Test
    public void testBoolTagDao() {
        boolTagDao.getTagValue();
    }

    @Before
    public void setUp() {
        db = new EmbeddedDatabaseBuilder().addDefaultScripts().build();
    }

    @After
    public void tearDown() {
        db.shutdown();
    }
}
