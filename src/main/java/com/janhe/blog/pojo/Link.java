package com.janhe.blog.pojo;

public class Link {
    private Integer oid;

    private String linkName;

    private String linkUrl;

    private String linkImg;

    private String backCode1;

    private String backCode3;

    private String backCode2;

    private String enableTag;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getLinkName() {
        return linkName;
    }

    public void setLinkName(String linkName) {
        this.linkName = linkName == null ? null : linkName.trim();
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl == null ? null : linkUrl.trim();
    }

    public String getLinkImg() {
        return linkImg;
    }

    public void setLinkImg(String linkImg) {
        this.linkImg = linkImg == null ? null : linkImg.trim();
    }

    public String getBackCode1() {
        return backCode1;
    }

    public void setBackCode1(String backCode1) {
        this.backCode1 = backCode1 == null ? null : backCode1.trim();
    }

    public String getBackCode3() {
        return backCode3;
    }

    public void setBackCode3(String backCode3) {
        this.backCode3 = backCode3 == null ? null : backCode3.trim();
    }

    public String getBackCode2() {
        return backCode2;
    }

    public void setBackCode2(String backCode2) {
        this.backCode2 = backCode2 == null ? null : backCode2.trim();
    }

    public String getEnableTag() {
        return enableTag;
    }

    public void setEnableTag(String enableTag) {
        this.enableTag = enableTag == null ? null : enableTag.trim();
    }
}