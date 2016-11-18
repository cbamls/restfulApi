package com.swagger.idoc.service.impl;

import com.swagger.idoc.mapper.TDocInfoMapper;
import com.swagger.idoc.po.TDocInfo;
import com.swagger.idoc.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * CopyRright (c)2014-2016 Haerbin Hearglobal Co.,Ltd
 * Project: idoc-main
 * Comments:
 * Author:cbam
 * Create Date:2016/11/13
 * Modified By:
 * Modified Date:
 * Modified Reason:
 */
public class TestServiceImpl implements TestService {
    @Autowired
    private TDocInfoMapper tDocInfoMapper;
    public TDocInfo getTDocInfo() {
        TDocInfo tDocInfo = tDocInfoMapper.selectByPrimaryKey(1);
        return tDocInfo;
    }
}
