package com.swagger.idoc.po;

public class TDocReqParam {
    private Integer id;

    private Integer pathItemId;

    private String name;

    private String location;

    private String type;

    private String defValue;

    private Boolean isRequired;

    private String cut;

    private Integer refId;

    private Boolean isArr;

    private Integer valueMax;

    private Integer minValue;

    private Integer maxLength;

    private Integer minLength;

    private Integer userDef;

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

    public String getDefValue() {
        return defValue;
    }

    public void setDefValue(String defValue) {
        this.defValue = defValue == null ? null : defValue.trim();
    }

    public Boolean getIsRequired() {
        return isRequired;
    }

    public void setIsRequired(Boolean isRequired) {
        this.isRequired = isRequired;
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

    public Boolean getIsArr() {
        return isArr;
    }

    public void setIsArr(Boolean isArr) {
        this.isArr = isArr;
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

    public Integer getUserDef() {
        return userDef;
    }

    public void setUserDef(Integer userDef) {
        this.userDef = userDef;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}