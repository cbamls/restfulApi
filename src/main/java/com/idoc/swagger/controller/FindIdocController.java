package com.idoc.swagger.controller;

import com.idoc.swagger.service.FindIdocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * CopyRright (c)2014-2016 Haerbin Hearglobal Co.,Ltd
 * Project: idoc
 * Comments:
 * Author:cbam
 * Create Date:2016/10/14
 * Modified By:
 * Modified Date:
 * Modified Reason:
 */
@Controller
@RequestMapping("/user")
public class FindIdocController {
    @Autowired
    private FindIdocService findIdocService;

    @RequestMapping("/findIdocById")
    public ModelAndView findIdocById() throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("idoc", findIdocService.selectByPrimaryKey(1));
        modelAndView.setViewName("test");
        return modelAndView;
    }
}
