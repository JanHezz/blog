package com.janhe.blog.pojo;

public class BlogInfo {
    private Integer oid;

    private String blogUrl;

    private String blogTitle;

    private String backCode1;

    private String backCode4;

    private String backCode3;

    private String backCode2;

    private String enableTag;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getBlogUrl() {
        return blogUrl;
    }

    public void setBlogUrl(String blogUrl) {
        this.blogUrl = blogUrl == null ? null : blogUrl.trim();
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle == null ? null : blogTitle.trim();
    }

    public String getBackCode1() {
        return backCode1;
    }

    public void setBackCode1(String backCode1) {
        this.backCode1 = backCode1 == null ? null : backCode1.trim();
    }

    public String getBackCode4() {
        return backCode4;
    }

    public void setBackCode4(String backCode4) {
        this.backCode4 = backCode4 == null ? null : backCode4.trim();
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