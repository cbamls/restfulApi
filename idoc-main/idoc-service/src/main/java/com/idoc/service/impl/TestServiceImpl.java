package com.idoc.service.impl;

import com.idoc.dao.mapper.TDocInfoMapper;
import com.swagger.idoc.po.TDocInfo;
import com.idoc.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TDocInfoMapper tDocInfoMapper;
    public TDocInfo getTDocInfo() {
        TDocInfo tDocInfo = tDocInfoMapper.selectByPrimaryKey(1);
        return tDocInfo;
    }
}
