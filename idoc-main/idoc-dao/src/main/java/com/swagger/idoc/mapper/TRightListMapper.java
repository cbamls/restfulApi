package com.swagger.idoc.mapper;

import com.swagger.idoc.po.TRightList;
import com.swagger.idoc.po.TRightListExample;
import java.util.List;

public interface TRightListMapper {
    int countByExample(TRightListExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TRightList record);

    int insertSelective(TRightList record);

    List<TRightList> selectByExample(TRightListExample example);

    TRightList selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TRightList record);

    int updateByPrimaryKey(TRightList record);
}