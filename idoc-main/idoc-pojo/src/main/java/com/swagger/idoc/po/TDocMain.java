package com.swagger.idoc.po;

import java.util.Date;

public class TDocMain {
    private Integer id;

    private String versionSwagger;

    private Integer infoId;

    private String host;

    private String basepath;

    private String schemes;

    private Integer externalDoc;

    private Integer securityDefine;

    private Date createTime;

    private Date updateTime;

    private Integer projectId;

    private Boolean publish;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVersionSwagger() {
        return versionSwagger;
    }

    public void setVersionSwagger(String versionSwagger) {
        this.versionSwagger = versionSwagger == null ? null : versionSwagger.trim();
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Boolean getPublish() {
        return publish;
    }

    public void setPublish(Boolean publish) {
        this.publish = publish;
    }
}