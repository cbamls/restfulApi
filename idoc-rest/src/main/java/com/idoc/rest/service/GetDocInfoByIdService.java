package com.idoc.rest.service;

import com.swagger.idoc.po.TDocInfo;

import java.util.HashMap;
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

public interface GetDocInfoByIdService {
    List getDocInfoById();
    List getDocMapByPageHelper();
}
