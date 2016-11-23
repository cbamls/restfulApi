package com.idoc.rest.service.impl;
import com.github.pagehelper.PageHelper;
import com.idoc.dao.mapper.TDocInfoMapper;
import com.swagger.idoc.po.TDocInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.idoc.rest.service.GetDocInfoByIdService;

import java.util.HashMap;
import java.util.List;

/**
 * CopyRright (c)2014-2016 Haerbin Hearglobal Co.,Ltd
 * Project: idoc-main
 * Comments:
 * Author:cbam
 * Create Date:2016/11/20
 * Modified By:
 * Modified Date:
 * Modified Reason:
 */
@Service
public class GetDocInfoByIdImpl implements GetDocInfoByIdService {
    @Autowired
    private TDocInfoMapper tDocInfoMapper;
    @Override
    public List getDocInfoById() {
        List<TDocInfo> list = tDocInfoMapper.selectAll();
        return list;
    }
    public List getDocMapByPageHelper() {
        PageHelper.startPage(1, 10);
       List<TDocInfo> list = tDocInfoMapper.selectAll();
        return list;
    }
}
