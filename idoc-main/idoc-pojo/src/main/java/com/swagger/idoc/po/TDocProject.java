package com.swagger.idoc.po;

import java.util.Date;

public class TDocProject {
    private Integer id;

    private String name;

    private String description;

    private Date createTime;

    private Date updateTime;

    private Integer cusId;

    private Byte ifValid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
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

    public Integer getCusId() {
        return cusId;
    }

    public void setCusId(Integer cusId) {
        this.cusId = cusId;
    }

    public Byte getIfValid() {
        return ifValid;
    }

    public void setIfValid(Byte ifValid) {
        this.ifValid = ifValid;
    }
}