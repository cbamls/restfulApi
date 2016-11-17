package com.swagger.idoc.mapper;

import com.swagger.idoc.po.TDocMain;
import com.swagger.idoc.po.TDocMainExample;
import java.util.List;

public interface TDocMainMapper {
    int countByExample(TDocMainExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TDocMain record);

    int insertSelective(TDocMain record);

    List<TDocMain> selectByExample(TDocMainExample example);

    TDocMain selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TDocMain record);

    int updateByPrimaryKey(TDocMain record);
}