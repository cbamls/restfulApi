package com.idoc.swagger.mapper;

import com.idoc.swagger.po.TDocProject;

public interface TDocProjectMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TDocProject record);

    int insertSelective(TDocProject record);

    TDocProject selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TDocProject record);

    int updateByPrimaryKey(TDocProject record);
}