package com.swagger.idoc.controller;

import com.swagger.idoc.po.TDocInfo;
import com.swagger.idoc.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
@Controller
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping("/test")
    @ResponseBody
    public TDocInfo getTestInfo() {
       TDocInfo tDocInfo = testService.getTDocInfo();
        return tDocInfo;
    }
}
