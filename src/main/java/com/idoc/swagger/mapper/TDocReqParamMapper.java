package com.idoc.swagger.mapper;

import com.idoc.swagger.po.TDocReqParam;

public interface TDocReqParamMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TDocReqParam record);

    int insertSelective(TDocReqParam record);

    TDocReqParam selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TDocReqParam record);

    int updateByPrimaryKeyWithBLOBs(TDocReqParam record);

    int updateByPrimaryKey(TDocReqParam record);
}