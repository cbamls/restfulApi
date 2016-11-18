package com.swagger.idoc.mapper;

import com.swagger.idoc.po.TDocTag;
import com.swagger.idoc.po.TDocTagExample;
import java.util.List;

public interface TDocTagMapper {
    int countByExample(TDocTagExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TDocTag record);

    int insertSelective(TDocTag record);

    List<TDocTag> selectByExampleWithBLOBs(TDocTagExample example);

    List<TDocTag> selectByExample(TDocTagExample example);

    TDocTag selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TDocTag record);

    int updateByPrimaryKeyWithBLOBs(TDocTag record);

    int updateByPrimaryKey(TDocTag record);
}