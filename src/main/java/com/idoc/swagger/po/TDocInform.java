package com.idoc.swagger.po;

public class TDocInform {
    private Integer id;

    private String name;

    private String informTime;

    private String content;

    private Byte ifRead;

    private Integer cusId;

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

    public String getInformTime() {
        return informTime;
    }

    public void setInformTime(String informTime) {
        this.informTime = informTime == null ? null : informTime.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Byte getIfRead() {
        return ifRead;
    }

    public void setIfRead(Byte ifRead) {
        this.ifRead = ifRead;
    }

    public Integer getCusId() {
        return cusId;
    }

    public void setCusId(Integer cusId) {
        this.cusId = cusId;
    }
}