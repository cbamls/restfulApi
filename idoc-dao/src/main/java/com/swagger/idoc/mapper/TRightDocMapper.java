package com.swagger.idoc.mapper;

import com.swagger.idoc.po.TRightDoc;
import com.swagger.idoc.po.TRightDocExample;
import java.util.List;

public interface TRightDocMapper {
    int countByExample(TRightDocExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TRightDoc record);

    int insertSelective(TRightDoc record);

    List<TRightDoc> selectByExample(TRightDocExample example);

    TRightDoc selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TRightDoc record);

    int updateByPrimaryKey(TRightDoc record);
}