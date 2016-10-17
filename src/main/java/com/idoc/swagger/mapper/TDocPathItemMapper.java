package com.idoc.swagger.mapper;

import com.idoc.swagger.po.TDocPathItem;

public interface TDocPathItemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TDocPathItem record);

    int insertSelective(TDocPathItem record);

    TDocPathItem selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TDocPathItem record);

    int updateByPrimaryKeyWithBLOBs(TDocPathItem record);

    int updateByPrimaryKey(TDocPathItem record);
}