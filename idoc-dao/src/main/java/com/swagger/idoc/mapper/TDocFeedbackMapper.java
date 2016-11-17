package com.swagger.idoc.mapper;

import com.swagger.idoc.po.TDocFeedback;
import com.swagger.idoc.po.TDocFeedbackExample;
import java.util.List;

public interface TDocFeedbackMapper {
    int countByExample(TDocFeedbackExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TDocFeedback record);

    int insertSelective(TDocFeedback record);

    List<TDocFeedback> selectByExample(TDocFeedbackExample example);

    TDocFeedback selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TDocFeedback record);

    int updateByPrimaryKey(TDocFeedback record);
}