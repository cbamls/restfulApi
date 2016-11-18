package com.swagger.idoc.po;

import java.util.Date;

public class TDocPathItem {
    private Integer id;

    private Integer pathId;

    private String protocol;

    private String tagIds;

    private String summary;

    private String operation;

    private String consumes;

    private String produces;

    private String appProtocol;

    private Date createTime;

    private Date updateTime;

    private String interCode;

    private Byte ifValid;

    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPathId() {
        return pathId;
    }

    public void setPathId(Integer pathId) {
        this.pathId = pathId;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol == null ? null : protocol.trim();
    }

    public String getTagIds() {
        return tagIds;
    }

    public void setTagIds(String tagIds) {
        this.tagIds = tagIds == null ? null : tagIds.trim();
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation == null ? null : operation.trim();
    }

    public String getConsumes() {
        return consumes;
    }

    public void setConsumes(String consumes) {
        this.consumes = consumes == null ? null : consumes.trim();
    }

    public String getProduces() {
        return produces;
    }

    public void setProduces(String produces) {
        this.produces = produces == null ? null : produces.trim();
    }

    public String getAppProtocol() {
        return appProtocol;
    }

    public void setAppProtocol(String appProtocol) {
        this.appProtocol = appProtocol == null ? null : appProtocol.trim();
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

    public String getInterCode() {
        return interCode;
    }

    public void setInterCode(String interCode) {
        this.interCode = interCode == null ? null : interCode.trim();
    }

    public Byte getIfValid() {
        return ifValid;
    }

    public void setIfValid(Byte ifValid) {
        this.ifValid = ifValid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}