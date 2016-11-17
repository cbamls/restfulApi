package com.swagger.idoc.mapper;

import com.swagger.idoc.po.TDocHistory;
import com.swagger.idoc.po.TDocHistoryExample;
import java.util.List;

public interface TDocHistoryMapper {
    int countByExample(TDocHistoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TDocHistory record);

    int insertSelective(TDocHistory record);

    List<TDocHistory> selectByExample(TDocHistoryExample example);

    TDocHistory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TDocHistory record);

    int updateByPrimaryKey(TDocHistory record);
}