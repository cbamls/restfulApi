package com.swagger.idoc.mapper;

import com.swagger.idoc.po.TDocRespHead;
import com.swagger.idoc.po.TDocRespHeadExample;
import java.util.List;

public interface TDocRespHeadMapper {
    int countByExample(TDocRespHeadExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TDocRespHead record);

    int insertSelective(TDocRespHead record);

    List<TDocRespHead> selectByExample(TDocRespHeadExample example);

    TDocRespHead selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TDocRespHead record);

    int updateByPrimaryKey(TDocRespHead record);
}