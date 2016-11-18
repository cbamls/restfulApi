package com.swagger.idoc.po;

import java.util.Date;

public class TDocSystemInfo {
    private Integer id;

    private Date appname;

    private Date requesturl;

    private Boolean errorcode;

    private String publisher;

    private String titile;

    private Date cancelTime;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getAppname() {
        return appname;
    }

    public void setAppname(Date appname) {
        this.appname = appname;
    }

    public Date getRequesturl() {
        return requesturl;
    }

    public void setRequesturl(Date requesturl) {
        this.requesturl = requesturl;
    }

    public Boolean getErrorcode() {
        return errorcode;
    }

    public void setErrorcode(Boolean errorcode) {
        this.errorcode = errorcode;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher == null ? null : publisher.trim();
    }

    public String getTitile() {
        return titile;
    }

    public void setTitile(String titile) {
        this.titile = titile == null ? null : titile.trim();
    }

    public Date getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(Date cancelTime) {
        this.cancelTime = cancelTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}