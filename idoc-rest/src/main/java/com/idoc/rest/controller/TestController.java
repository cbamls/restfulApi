package com.idoc.rest.controller;

import com.idoc.rest.service.GetDocInfoByIdService;
import com.swagger.idoc.po.TDocInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

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
    private GetDocInfoByIdService getDocInfoByIdService;
    @ResponseBody
    @RequestMapping("/find")
    public List getDocInfoById() {
        List<TDocInfo> list = getDocInfoByIdService.getDocMapByPageHelper();
        //HashMap map = getDocInfoByIdService.getDocMap();
      /*  Logger logger = Logger.getLogger(TestController.class);
        logger.debug("cbamcbam");*/
        return list;
    }
}
