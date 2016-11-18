package com.swagger.idoc.po;

public class TDocRespHead {
    private Integer id;

    private String appname;

    private String requesturl;

    private String errorcode;

    private String errormsg;

    private Long success;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAppname() {
        return appname;
    }

    public void setAppname(String appname) {
        this.appname = appname == null ? null : appname.trim();
    }

    public String getRequesturl() {
        return requesturl;
    }

    public void setRequesturl(String requesturl) {
        this.requesturl = requesturl == null ? null : requesturl.trim();
    }

    public String getErrorcode() {
        return errorcode;
    }

    public void setErrorcode(String errorcode) {
        this.errorcode = errorcode == null ? null : errorcode.trim();
    }

    public String getErrormsg() {
        return errormsg;
    }

    public void setErrormsg(String errormsg) {
        this.errormsg = errormsg == null ? null : errormsg.trim();
    }

    public Long getSuccess() {
        return success;
    }

    public void setSuccess(Long success) {
        this.success = success;
    }
}