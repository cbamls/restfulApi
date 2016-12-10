package com.idoc.sso.controller;

import com.idoc.common.utils.BaseService;
import com.idoc.sso.service.impl.TestById;
import com.swagger.idoc.po.TDocInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * CopyRright (c)2014-2016 Haerbin Hearglobal Co.,Ltd
 * Project: idoc-parent
 * Comments:
 * Author:cbam
 * Create Date:2016/12/10
 * Modified By:
 * Modified Date:
 * Modified Reason:
 */
@Controller
public class Test {
    @Autowired
    private TestById testById;
    @ResponseBody
    @RequestMapping("/f")
    public TDocInfo getDocInfoById() {
        TDocInfo tDocInfo = testById.queryById(1);
        return tDocInfo;
    }
    @RequestMapping("/f2")
    @ResponseBody
    public List get() {
        List list = testById.queryAll();
        return list;
    }
}
