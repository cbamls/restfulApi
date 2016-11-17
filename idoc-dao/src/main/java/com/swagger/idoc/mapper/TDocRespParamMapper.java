package com.swagger.idoc.mapper;

import com.swagger.idoc.po.TDocRespParam;
import com.swagger.idoc.po.TDocRespParamExample;
import java.util.List;

public interface TDocRespParamMapper {
    int countByExample(TDocRespParamExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TDocRespParam record);

    int insertSelective(TDocRespParam record);

    List<TDocRespParam> selectByExampleWithBLOBs(TDocRespParamExample example);

    List<TDocRespParam> selectByExample(TDocRespParamExample example);

    TDocRespParam selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TDocRespParam record);

    int updateByPrimaryKeyWithBLOBs(TDocRespParam record);

    int updateByPrimaryKey(TDocRespParam record);
}