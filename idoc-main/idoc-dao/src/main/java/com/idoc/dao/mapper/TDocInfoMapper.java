package com.idoc.dao.mapper;

import com.swagger.idoc.po.TDocInfo;
import com.swagger.idoc.po.TDocInfoExample;
import java.util.List;

public interface TDocInfoMapper {
    int countByExample(TDocInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TDocInfo record);

    int insertSelective(TDocInfo record);

    List<TDocInfo> selectByExampleWithBLOBs(TDocInfoExample example);

    List<TDocInfo> selectByExample(TDocInfoExample example);

    TDocInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TDocInfo record);

    int updateByPrimaryKeyWithBLOBs(TDocInfo record);

    int updateByPrimaryKey(TDocInfo record);
}