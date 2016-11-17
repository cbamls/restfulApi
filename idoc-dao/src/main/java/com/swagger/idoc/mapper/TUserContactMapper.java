package com.swagger.idoc.mapper;

import com.swagger.idoc.po.TUserContact;
import com.swagger.idoc.po.TUserContactExample;
import java.util.List;

public interface TUserContactMapper {
    int countByExample(TUserContactExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TUserContact record);

    int insertSelective(TUserContact record);

    List<TUserContact> selectByExampleWithBLOBs(TUserContactExample example);

    List<TUserContact> selectByExample(TUserContactExample example);

    TUserContact selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TUserContact record);

    int updateByPrimaryKeyWithBLOBs(TUserContact record);

    int updateByPrimaryKey(TUserContact record);
}