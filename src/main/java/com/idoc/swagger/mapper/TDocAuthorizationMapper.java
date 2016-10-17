package com.idoc.swagger.mapper;

import com.idoc.swagger.po.TDocAuthorization;

public interface TDocAuthorizationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TDocAuthorization record);

    int insertSelective(TDocAuthorization record);

    TDocAuthorization selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TDocAuthorization record);

    int updateByPrimaryKey(TDocAuthorization record);
}