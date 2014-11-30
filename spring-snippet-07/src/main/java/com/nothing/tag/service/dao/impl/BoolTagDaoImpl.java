package com.nothing.tag.service.dao.impl;

import com.nothing.tag.service.dao.BoolTagDao;
import com.nothing.tag.service.dataobject.BoolTagDO;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chenliu, create at 11/25/14 11:20
 */
public class BoolTagDaoImpl extends SqlMapClientDaoSupport implements BoolTagDao {
    public BoolTagDO getBoolTagDO(Long userId) {
        BoolTagDO boolTagDO = null;
        boolTagDO = (BoolTagDO) getSqlMapClientTemplate().queryForObject("uic_bool_tag.selectBoolTagsById", userId);
        return boolTagDO;
    }

    public void enableSeat(Long userId, String tagName, int seat) {
        Map<String, Object> queryData = new HashMap<String, Object>();
        queryData.put("userId", userId);
        queryData.put("seat", seat);
        getSqlMapClientTemplate().update("uic_bool_tag.enable" + tagName + "Seat", queryData);
    }

    public void disableSeat(Long userId, String tagName, int seat) {
        Map<String, Object> queryData = new HashMap<String, Object>();
        queryData.put("userId", userId);
        queryData.put("seat", seat);
        getSqlMapClientTemplate().update("uic_bool_tag.disable" + tagName + "Seat", queryData);
    }

    public void setTagValue(Long userId, String tagName, long value) {
        Map<String, Object> queryData = new HashMap<String, Object>();
        queryData.put("userId", userId);
        queryData.put("tagValue", value);
        getSqlMapClientTemplate().update("uic_bool_tag.set" + tagName + "Value", queryData);
    }

    public void addTagValue(Long userId, String tagName, long value) {
        Map<String, Object> queryData = new HashMap<String, Object>();
        queryData.put("userId", userId);
        queryData.put("tagValue", value);
        getSqlMapClientTemplate().update("uic_bool_tag.add" + tagName + "Value", queryData);
    }
}

