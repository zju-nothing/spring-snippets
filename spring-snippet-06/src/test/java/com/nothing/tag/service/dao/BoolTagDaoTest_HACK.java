package com.nothing.tag.service.dao;

import com.nothing.tag.service.dataobject.BoolTagDO;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.ResourceLoader;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author chenliu, create at 11/25/14 12:27
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/spring/root-context-test-hack.xml")
public class BoolTagDaoTest_HACK {

    @Autowired
    ResourceDatabasePopulator databasePopulator;

    ResourceLoader resourceLoader = new DefaultResourceLoader();

    //FIXME Add the db init sql script manually.But didn't work, since the ResourceDatabasePopulator.addScript()  is invoked after EmbeddedDatabaseFactoryBean.getObject()
    @Before
    public void setUp() {
        String schemaSql = "database/schema.sql";
        String initSql = "database/test-data2.sql";
        databasePopulator.addScript(resourceLoader.getResource(schemaSql));
        databasePopulator.addScript(resourceLoader.getResource(initSql));
    }

    @Autowired
    private BoolTagDao boolTagDao;

    @Test
    public void testBoolTagDao() {
        BoolTagDO boolTagDO = boolTagDao.getBoolTagDO(123L);
        long tagValue = boolTagDO.getTag1();
        Assert.assertEquals(200L, tagValue);
    }
}
