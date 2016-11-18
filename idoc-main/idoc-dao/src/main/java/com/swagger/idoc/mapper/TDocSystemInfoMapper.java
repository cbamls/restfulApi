package com.swagger.idoc.mapper;

import com.swagger.idoc.po.TDocSystemInfo;
import com.swagger.idoc.po.TDocSystemInfoExample;
import java.util.List;

public interface TDocSystemInfoMapper {
    int countByExample(TDocSystemInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TDocSystemInfo record);

    int insertSelective(TDocSystemInfo record);

    List<TDocSystemInfo> selectByExampleWithBLOBs(TDocSystemInfoExample example);

    List<TDocSystemInfo> selectByExample(TDocSystemInfoExample example);

    TDocSystemInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TDocSystemInfo record);

    int updateByPrimaryKeyWithBLOBs(TDocSystemInfo record);

    int updateByPrimaryKey(TDocSystemInfo record);
}