package com.idoc.swagger.po;

public class TDocReqParam {
    private Integer id;

    private Integer pathItemId;

    private String name;

    private String location;

    private String type;

    private String defa;

    private Boolean isrequired;

    private String cut;

    private Integer refId;

    private Boolean isarr;

    private Integer valueMax;

    private Integer minValue;

    private Integer maxLength;

    private Integer minLength;

    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPathItemId() {
        return pathItemId;
    }

    public void setPathItemId(Integer pathItemId) {
        this.pathItemId = pathItemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getDefa() {
        return defa;
    }

    public void setDefa(String defa) {
        this.defa = defa == null ? null : defa.trim();
    }

    public Boolean getIsrequired() {
        return isrequired;
    }

    public void setIsrequired(Boolean isrequired) {
        this.isrequired = isrequired;
    }

    public String getCut() {
        return cut;
    }

    public void setCut(String cut) {
        this.cut = cut == null ? null : cut.trim();
    }

    public Integer getRefId() {
        return refId;
    }

    public void setRefId(Integer refId) {
        this.refId = refId;
    }

    public Boolean getIsarr() {
        return isarr;
    }

    public void setIsarr(Boolean isarr) {
        this.isarr = isarr;
    }

    public Integer getValueMax() {
        return valueMax;
    }

    public void setValueMax(Integer valueMax) {
        this.valueMax = valueMax;
    }

    public Integer getMinValue() {
        return minValue;
    }

    public void setMinValue(Integer minValue) {
        this.minValue = minValue;
    }

    public Integer getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }

    public Integer getMinLength() {
        return minLength;
    }

    public void setMinLength(Integer minLength) {
        this.minLength = minLength;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}