package com.swagger.idoc.mapper;

import com.swagger.idoc.po.TDocInform;
import com.swagger.idoc.po.TDocInformExample;
import java.util.List;

public interface TDocInformMapper {
    int countByExample(TDocInformExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TDocInform record);

    int insertSelective(TDocInform record);

    List<TDocInform> selectByExample(TDocInformExample example);

    TDocInform selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TDocInform record);

    int updateByPrimaryKey(TDocInform record);
}