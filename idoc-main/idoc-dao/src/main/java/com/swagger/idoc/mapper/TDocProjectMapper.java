package com.swagger.idoc.mapper;

import com.swagger.idoc.po.TDocProject;
import com.swagger.idoc.po.TDocProjectExample;
import java.util.List;

public interface TDocProjectMapper {
    int countByExample(TDocProjectExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TDocProject record);

    int insertSelective(TDocProject record);

    List<TDocProject> selectByExample(TDocProjectExample example);

    TDocProject selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TDocProject record);

    int updateByPrimaryKey(TDocProject record);
}