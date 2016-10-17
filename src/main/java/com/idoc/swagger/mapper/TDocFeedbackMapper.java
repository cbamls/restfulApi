package com.idoc.swagger.mapper;

import com.idoc.swagger.po.TDocFeedback;

public interface TDocFeedbackMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TDocFeedback record);

    int insertSelective(TDocFeedback record);

    TDocFeedback selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TDocFeedback record);

    int updateByPrimaryKey(TDocFeedback record);
}