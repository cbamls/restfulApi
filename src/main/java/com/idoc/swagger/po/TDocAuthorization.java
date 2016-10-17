package com.idoc.swagger.po;

public class TDocAuthorization {
    private Integer id;

    private Integer licensorId;

    private Integer licenseeId;

    private Integer projectId;

    private String licenceTime;

    private Byte ifCancelAuth;

    private String rightStr;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLicensorId() {
        return licensorId;
    }

    public void setLicensorId(Integer licensorId) {
        this.licensorId = licensorId;
    }

    public Integer getLicenseeId() {
        return licenseeId;
    }

    public void setLicenseeId(Integer licenseeId) {
        this.licenseeId = licenseeId;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getLicenceTime() {
        return licenceTime;
    }

    public void setLicenceTime(String licenceTime) {
        this.licenceTime = licenceTime == null ? null : licenceTime.trim();
    }

    public Byte getIfCancelAuth() {
        return ifCancelAuth;
    }

    public void setIfCancelAuth(Byte ifCancelAuth) {
        this.ifCancelAuth = ifCancelAuth;
    }

    public String getRightStr() {
        return rightStr;
    }

    public void setRightStr(String rightStr) {
        this.rightStr = rightStr == null ? null : rightStr.trim();
    }
}