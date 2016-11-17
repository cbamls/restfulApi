package com.swagger.idoc.mapper;

import com.swagger.idoc.po.TDocPathItem;
import com.swagger.idoc.po.TDocPathItemExample;
import java.util.List;

public interface TDocPathItemMapper {
    int countByExample(TDocPathItemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TDocPathItem record);

    int insertSelective(TDocPathItem record);

    List<TDocPathItem> selectByExampleWithBLOBs(TDocPathItemExample example);

    List<TDocPathItem> selectByExample(TDocPathItemExample example);

    TDocPathItem selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TDocPathItem record);

    int updateByPrimaryKeyWithBLOBs(TDocPathItem record);

    int updateByPrimaryKey(TDocPathItem record);
}