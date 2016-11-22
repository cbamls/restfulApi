package com.idoc.rest.service.impl;
import com.idoc.dao.mapper.TDocInfoMapper;
import com.swagger.idoc.po.TDocInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.idoc.rest.service.GetDocInfoByIdService;
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
        TDocInfo tDocInfo = tDocInfoMapper.selectByPrimaryKey(1);
        return tDocInfo;
    }
}
