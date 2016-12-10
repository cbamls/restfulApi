package com.idoc.sso.service.impl;
import com.idoc.dao.mapper.TDocInfoMapper;
import com.swagger.idoc.po.TDocInfo;
import com.idoc.sso.service.GetDocInfoByIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public TDocInfo getDocInfoById() {
        TDocInfo tDocInfo = tDocInfoMapper.selectByPrimaryKey(String.valueOf(1));
        return tDocInfo;
    }
}
