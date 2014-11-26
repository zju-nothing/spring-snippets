package com.nothing.tag.service.dao.impl;

import com.nothing.tag.service.dao.BoolTagDao;
import com.nothing.tag.service.dataobject.BoolTagDO;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

/**
 * @author chenliu, create at 11/25/14 11:20
 */
public class BoolTagDaoImpl extends SqlMapClientDaoSupport implements BoolTagDao {
    public BoolTagDO getBoolTagDO(Long userId) {
        BoolTagDO boolTagDO = null;
        boolTagDO = (BoolTagDO) getSqlMapClientTemplate().queryForObject("uic_bool_tag.selectBoolTagsById", userId);
        return boolTagDO;
    }
}

