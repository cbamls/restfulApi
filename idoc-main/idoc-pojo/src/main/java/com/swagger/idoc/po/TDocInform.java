package com.swagger.idoc.po;

import java.util.Date;

public class TDocInform {
    private Integer id;

    private String name;

    private Date informTime;

    private String content;

    private Byte ifRead;

    private Integer cusId;

    private String informType;

    private Boolean cancel;

    private Date cancelTime;

    private Integer sender;

    private Integer receiver;

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

    public Date getInformTime() {
        return informTime;
    }

    public void setInformTime(Date informTime) {
        this.informTime = informTime;
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

    public String getInformType() {
        return informType;
    }

    public void setInformType(String informType) {
        this.informType = informType == null ? null : informType.trim();
    }

    public Boolean getCancel() {
        return cancel;
    }

    public void setCancel(Boolean cancel) {
        this.cancel = cancel;
    }

    public Date getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(Date cancelTime) {
        this.cancelTime = cancelTime;
    }

    public Integer getSender() {
        return sender;
    }

    public void setSender(Integer sender) {
        this.sender = sender;
    }

    public Integer getReceiver() {
        return receiver;
    }

    public void setReceiver(Integer receiver) {
        this.receiver = receiver;
    }
}