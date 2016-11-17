package com.swagger.idoc.mapper;

import com.swagger.idoc.po.TDocDefinitions;
import com.swagger.idoc.po.TDocDefinitionsExample;
import java.util.List;

public interface TDocDefinitionsMapper {
    int countByExample(TDocDefinitionsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TDocDefinitions record);

    int insertSelective(TDocDefinitions record);

    List<TDocDefinitions> selectByExampleWithBLOBs(TDocDefinitionsExample example);

    List<TDocDefinitions> selectByExample(TDocDefinitionsExample example);

    TDocDefinitions selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TDocDefinitions record);

    int updateByPrimaryKeyWithBLOBs(TDocDefinitions record);

    int updateByPrimaryKey(TDocDefinitions record);
}