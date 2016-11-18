package com.swagger.idoc.mapper;

import com.swagger.idoc.po.TDocPath;
import com.swagger.idoc.po.TDocPathExample;
import java.util.List;

public interface TDocPathMapper {
    int countByExample(TDocPathExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TDocPath record);

    int insertSelective(TDocPath record);

    List<TDocPath> selectByExample(TDocPathExample example);

    TDocPath selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TDocPath record);

    int updateByPrimaryKey(TDocPath record);
}