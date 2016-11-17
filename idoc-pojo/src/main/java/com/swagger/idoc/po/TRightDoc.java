package com.swagger.idoc.po;

import java.util.Date;

public class TRightDoc {
    private Integer id;

    private Integer projectId;

    private Date licence;

    private String rightStr;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Date getLicence() {
        return licence;
    }

    public void setLicence(Date licence) {
        this.licence = licence;
    }

    public String getRightStr() {
        return rightStr;
    }

    public void setRightStr(String rightStr) {
        this.rightStr = rightStr == null ? null : rightStr.trim();
    }
}