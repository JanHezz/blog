package com.janhe.blog.pojo;

public class BlogInfoWithBLOBs extends BlogInfo {
    private String blogDes;

    private String autherInfo;

    private String linkInfo;

    private String adInfo;

    public String getBlogDes() {
        return blogDes;
    }

    public void setBlogDes(String blogDes) {
        this.blogDes = blogDes == null ? null : blogDes.trim();
    }

    public String getAutherInfo() {
        return autherInfo;
    }

    public void setAutherInfo(String autherInfo) {
        this.autherInfo = autherInfo == null ? null : autherInfo.trim();
    }

    public String getLinkInfo() {
        return linkInfo;
    }

    public void setLinkInfo(String linkInfo) {
        this.linkInfo = linkInfo == null ? null : linkInfo.trim();
    }

    public String getAdInfo() {
        return adInfo;
    }

    public void setAdInfo(String adInfo) {
        this.adInfo = adInfo == null ? null : adInfo.trim();
    }
}