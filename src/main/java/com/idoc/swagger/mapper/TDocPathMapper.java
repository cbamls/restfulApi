package com.idoc.swagger.mapper;

import com.idoc.swagger.po.TDocPath;

public interface TDocPathMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TDocPath record);

    int insertSelective(TDocPath record);

    TDocPath selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TDocPath record);

    int updateByPrimaryKey(TDocPath record);
}