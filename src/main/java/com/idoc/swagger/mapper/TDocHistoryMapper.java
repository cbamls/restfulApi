package com.idoc.swagger.mapper;

import com.idoc.swagger.po.TDocHistory;

public interface TDocHistoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TDocHistory record);

    int insertSelective(TDocHistory record);

    TDocHistory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TDocHistory record);

    int updateByPrimaryKey(TDocHistory record);
}