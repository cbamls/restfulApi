package com.idoc.swagger.serviceImpl;

import com.idoc.swagger.mapper.TDocMapper;
import com.idoc.swagger.po.TDoc;
import com.idoc.swagger.service.FindIdocService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

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
public class FindIdocServiceImpl implements FindIdocService {
    @Autowired
    private TDocMapper t_docMapper;
    @Override
    public TDoc selectByPrimaryKey(Integer id) throws Exception {
        Logger logger = Logger.getLogger("FindIdocServiceImpl");
        logger.debug("debug");
         TDoc t_doc = t_docMapper.selectByPrimaryKey(1);
        return t_doc;
    }
}
