package com.nothing.tag.service.dao;

import com.nothing.tag.service.dataobject.BoolTagDO;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author chenliu, create at 11/25/14 11:20
 */
public interface BoolTagDao {
    BoolTagDO getBoolTagDO(Long userId);

    void enableSeat(Long userId,String tagName,int seat);

    void disableSeat(Long userId, String tagName, int seat);

    void setTagValue(Long userId,String tagName,long value);

    void addTagValue(Long userId,String tagName,long value);
}
