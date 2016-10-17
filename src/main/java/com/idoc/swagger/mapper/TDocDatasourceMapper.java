package com.idoc.swagger.mapper;

import com.idoc.swagger.po.TDocDatasource;

public interface TDocDatasourceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TDocDatasource record);

    int insertSelective(TDocDatasource record);

    TDocDatasource selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TDocDatasource record);

    int updateByPrimaryKey(TDocDatasource record);
}