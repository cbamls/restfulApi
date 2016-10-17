package com.idoc.swagger.po;

public class TDoc {
    private Integer id;

    private String verSwagger;

    private Integer infoId;

    private String host;

    private String basepath;

    private String schemes;

    private Integer externalDoc;

    private Integer securityDefine;

    private String createTime;

    private String updateTime;

    private Integer projectId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVerSwagger() {
        return verSwagger;
    }

    public void setVerSwagger(String verSwagger) {
        this.verSwagger = verSwagger == null ? null : verSwagger.trim();
    }

    public Integer getInfoId() {
        return infoId;
    }

    public void setInfoId(Integer infoId) {
        this.infoId = infoId;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host == null ? null : host.trim();
    }

    public String getBasepath() {
        return basepath;
    }

    public void setBasepath(String basepath) {
        this.basepath = basepath == null ? null : basepath.trim();
    }

    public String getSchemes() {
        return schemes;
    }

    public void setSchemes(String schemes) {
        this.schemes = schemes == null ? null : schemes.trim();
    }

    public Integer getExternalDoc() {
        return externalDoc;
    }

    public void setExternalDoc(Integer externalDoc) {
        this.externalDoc = externalDoc;
    }

    public Integer getSecurityDefine() {
        return securityDefine;
    }

    public void setSecurityDefine(Integer securityDefine) {
        this.securityDefine = securityDefine;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }
}