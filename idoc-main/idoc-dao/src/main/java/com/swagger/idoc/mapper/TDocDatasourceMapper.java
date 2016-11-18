package com.swagger.idoc.mapper;

import com.swagger.idoc.po.TDocDatasource;
import com.swagger.idoc.po.TDocDatasourceExample;
import java.util.List;

public interface TDocDatasourceMapper {
    int countByExample(TDocDatasourceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TDocDatasource record);

    int insertSelective(TDocDatasource record);

    List<TDocDatasource> selectByExample(TDocDatasourceExample example);

    TDocDatasource selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TDocDatasource record);

    int updateByPrimaryKey(TDocDatasource record);
}