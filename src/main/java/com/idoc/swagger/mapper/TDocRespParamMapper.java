package com.idoc.swagger.mapper;

import com.idoc.swagger.po.TDocRespParam;

public interface TDocRespParamMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TDocRespParam record);

    int insertSelective(TDocRespParam record);

    TDocRespParam selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TDocRespParam record);

    int updateByPrimaryKeyWithBLOBs(TDocRespParam record);

    int updateByPrimaryKey(TDocRespParam record);
}