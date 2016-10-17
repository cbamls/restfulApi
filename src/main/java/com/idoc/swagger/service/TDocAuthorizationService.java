package com.idoc.swagger.service;

import com.idoc.swagger.po.TDocAuthorization;

/**
 * CopyRright (c)2014-2016 Haerbin Hearglobal Co.,Ltd
 * Project: idoc
 * Comments:
 * Author:cbam
 * Create Date:2016/10/16
 * Modified By:
 * Modified Date:
 * Modified Reason:
 */
public interface TDocAuthorizationService {
    int deleteByPrimaryKey(Integer id);

    int insert(TDocAuthorization record);

    int insertSelective(TDocAuthorization record);

    TDocAuthorization selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TDocAuthorization record);

    int updateByPrimaryKey(TDocAuthorization record);
}
