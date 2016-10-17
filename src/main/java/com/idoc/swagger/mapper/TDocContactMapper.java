package com.idoc.swagger.mapper;

import com.idoc.swagger.po.TDocContact;

public interface TDocContactMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TDocContact record);

    int insertSelective(TDocContact record);

    TDocContact selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TDocContact record);

    int updateByPrimaryKeyWithBLOBs(TDocContact record);

    int updateByPrimaryKey(TDocContact record);
}