package com.idoc.swagger.mapper;

import com.idoc.swagger.po.TDocRespHead;

public interface TDocRespHeadMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TDocRespHead record);

    int insertSelective(TDocRespHead record);

    TDocRespHead selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TDocRespHead record);

    int updateByPrimaryKey(TDocRespHead record);
}