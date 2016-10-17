package com.idoc.swagger.mapper;

import com.idoc.swagger.po.TDoc;

public interface TDocMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TDoc record);

    int insertSelective(TDoc record);

    TDoc selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TDoc record);

    int updateByPrimaryKey(TDoc record);
}