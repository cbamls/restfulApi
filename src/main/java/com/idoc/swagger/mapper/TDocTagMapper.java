package com.idoc.swagger.mapper;

import com.idoc.swagger.po.TDocTag;

public interface TDocTagMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TDocTag record);

    int insertSelective(TDocTag record);

    TDocTag selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TDocTag record);

    int updateByPrimaryKeyWithBLOBs(TDocTag record);

    int updateByPrimaryKey(TDocTag record);
}