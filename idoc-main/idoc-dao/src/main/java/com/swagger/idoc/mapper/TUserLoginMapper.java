package com.swagger.idoc.mapper;

import com.swagger.idoc.po.TUserLogin;
import com.swagger.idoc.po.TUserLoginExample;
import java.util.List;

public interface TUserLoginMapper {
    int countByExample(TUserLoginExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TUserLogin record);

    int insertSelective(TUserLogin record);

    List<TUserLogin> selectByExample(TUserLoginExample example);

    TUserLogin selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TUserLogin record);

    int updateByPrimaryKey(TUserLogin record);
}