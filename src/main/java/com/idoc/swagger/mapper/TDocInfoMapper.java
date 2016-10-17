package com.idoc.swagger.mapper;

import com.idoc.swagger.po.TDocInfo;

public interface TDocInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TDocInfo record);

    int insertSelective(TDocInfo record);

    TDocInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TDocInfo record);

    int updateByPrimaryKeyWithBLOBs(TDocInfo record);

    int updateByPrimaryKey(TDocInfo record);
}