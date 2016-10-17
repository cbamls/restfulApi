package com.idoc.swagger.service;


import com.idoc.swagger.po.TDoc;

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
public interface FindIdocService {
    public TDoc selectByPrimaryKey(Integer id) throws Exception;
}
