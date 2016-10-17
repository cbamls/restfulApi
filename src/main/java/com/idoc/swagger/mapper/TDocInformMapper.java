package com.idoc.swagger.mapper;

import com.idoc.swagger.po.TDocInform;

public interface TDocInformMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TDocInform record);

    int insertSelective(TDocInform record);

    TDocInform selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TDocInform record);

    int updateByPrimaryKey(TDocInform record);
}