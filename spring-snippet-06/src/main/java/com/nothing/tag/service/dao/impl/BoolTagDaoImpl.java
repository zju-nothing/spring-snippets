package com.nothing.tag.service.dao.impl;

import com.nothing.tag.service.dao.BoolTagDao;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author chenliu, create at 11/25/14 11:20
 */
public class BoolTagDaoImpl implements BoolTagDao {
    private JdbcTemplate jdbcTemplate;

    public Long getTagValue() {
        jdbcTemplate.execute("select 1");
        return 0L;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
