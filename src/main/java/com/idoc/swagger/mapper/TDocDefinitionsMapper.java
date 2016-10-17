package com.idoc.swagger.mapper;

import com.idoc.swagger.po.TDocDefinitions;

public interface TDocDefinitionsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TDocDefinitions record);

    int insertSelective(TDocDefinitions record);

    TDocDefinitions selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TDocDefinitions record);

    int updateByPrimaryKeyWithBLOBs(TDocDefinitions record);

    int updateByPrimaryKey(TDocDefinitions record);
}