package com.idoc.sso.controller;

import com.idoc.sso.jedisUtils.JedisUtil;
import com.idoc.sso.jedisUtils.impl.JedisUtilSingle;
import com.swagger.idoc.po.TDocInfo;
import com.idoc.sso.service.GetDocInfoByIdService;
/*import org.apache.log4j.Logger;*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
@Controller
public class TestController {
    @Autowired
    private GetDocInfoByIdService getDocInfoByIdService;
    @Autowired
    private JedisUtil jedisClientSingle;
   /* @Value("${KEY}")
    private String key;*/
    @ResponseBody
    @RequestMapping("/find")
    public List getDocInfoById() {
        List tDocInfo = getDocInfoByIdService.getDocInfoById();
      /*  Logger logger = Logger.getLogger(TestController.class);
        logger.debug("cbamcbam");*/
        jedisClientSingle.set("key", "cbam");
        String target = jedisClientSingle.get("key");
        System.out.println(target);
      //  System.out.println("key => " + key);
        return tDocInfo;
    }
}
