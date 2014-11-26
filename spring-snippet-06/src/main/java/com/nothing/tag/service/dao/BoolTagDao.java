package com.nothing.tag.service.dao;

import com.nothing.tag.service.dataobject.BoolTagDO;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author chenliu, create at 11/25/14 11:20
 */
public interface BoolTagDao {
    BoolTagDO getBoolTagDO(Long userId);
}
