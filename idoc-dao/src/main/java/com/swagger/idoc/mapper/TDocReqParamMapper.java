package com.swagger.idoc.mapper;

import com.swagger.idoc.po.TDocReqParam;
import com.swagger.idoc.po.TDocReqParamExample;
import java.util.List;

public interface TDocReqParamMapper {
    int countByExample(TDocReqParamExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TDocReqParam record);

    int insertSelective(TDocReqParam record);

    List<TDocReqParam> selectByExampleWithBLOBs(TDocReqParamExample example);

    List<TDocReqParam> selectByExample(TDocReqParamExample example);

    TDocReqParam selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TDocReqParam record);

    int updateByPrimaryKeyWithBLOBs(TDocReqParam record);

    int updateByPrimaryKey(TDocReqParam record);
}