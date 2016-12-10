/*
package com.idoc.sso.controller;

import com.idoc.sso.service.GetDocInfoByIdService;
import com.swagger.idoc.po.TDocInfo;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

*/
/**
 * CopyRright (c)2014-2016 Haerbin Hearglobal Co.,Ltd
 * Project: idoc-parent
 * Comments:
 * Author:cbam
 * Create Date:2016/11/25
 * Modified By:
 * Modified Date:
 * Modified Reason:
 *//*


public class TestControllerTest extends BaseJunit4Test {
    private static Logger logger = LoggerFactory.getLogger(TestController.class);
    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Autowired
    private GetDocInfoByIdService getDocInfoByIdService;
    @Before
    public void setUp() throws Exception {
        logger.debug("=>>>>> setUp()");
        mockMvc =  MockMvcBuilders.webAppContextSetup( webApplicationContext ).build();
    }

    @After
    public void tearDown() throws Exception {
        logger.debug("=>>>>> tearDown");
    }

    @Test
    @Transactional   //标明此方法需使用事务
    @Rollback(true)  //标明使用完此方法后事务不回滚,true时为回滚
    public void getDocInfoById() throws Exception {
    TDocInfo tDocInfo = getDocInfoByIdService.getDocInfoById();
        System.out.println("Test");
        System.out.println("tDocInfo => " + tDocInfo);
        this.mockMvc
                .perform((get("/find"))
                        .accept(MediaType.parseMediaType("application/json;charset=UTF-8")))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json;charset=UTF-8"))
                .andDo(print()); // print
        //System.out.println("key=>" + key);
    }
   */
/* *//*
*/
/*
     @Test
    public void getUserMsg() throws Exception {
        // get using get
        this.mockMvc
                .perform((get("/user/userMsg/003"))
                        .accept(MediaType.parseMediaType("application/json;charset=UTF-8")))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json;charset=UTF-8"))
                .andDo(print()); // print
    }

    @Test
    // don't rollback
    @Rollback(false)
    public void putUserMsg() throws Exception {
        // update using put
        this.mockMvc
                .perform((put("/user/userMsg/003"))
                        .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                        .param("userName","新名字03号")
                        .session((MockHttpSession)getLoginSession())
                        .accept(MediaType.parseMediaType("application/json;charset=UTF-8"))
                        )
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json;charset=UTF-8"))
                .andDo(print()); // print
    }

    @Test
    public void delUser() throws Exception {
        // delete using delete
        this.mockMvc
                .perform((delete("/user/userMsg/004"))
                        .accept(MediaType.parseMediaType("application/json;charset=UTF-8"))
                        )
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json;charset=UTF-8"))
                .andDo(print()); //print
    }

    @Test
    // don't rollback
    @Rollback(false)
    public void postUser() throws Exception{
        // add using post
        this.mockMvc
                .perform((post("/user/userMsg"))
                        .param("userName", "最新的用户")
                        .accept(MediaType.parseMediaType("application/json;charset=UTF-8"))
                        )
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json;charset=UTF-8"))
                .andDo(print()); //print
    }

    *//*
*/
/**
     * 获取登入信息session
     * @return
     * @throws Exception
     *//*
*/
/*
    private HttpSession getLoginSession() throws Exception{
        // mock request get login session
        // url = /xxx/xxx/{username}/{password}
        MvcResult result = this.mockMvc
                .perform((get("/user/userMsg/loginUser/loginUser")))
                .andExpect(status().isOk())
                .andReturn();
        return result.getRequest().getSession();
    }
   *//*

}
*/
