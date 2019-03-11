package com.janhe.blog.pojo;

import java.util.Date;

public class Message {
    private String oid;

    private String nickName;

    private String email;

    private Date createTime;

    private String enableTag;

    private Integer orderBy;

    private String backCode1;

    private String backCode2;

    private String backCode3;

    private String content;

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid == null ? null : oid.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getEnableTag() {
        return enableTag;
    }

    public void setEnableTag(String enableTag) {
        this.enableTag = enableTag == null ? null : enableTag.trim();
    }

    public Integer getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(Integer orderBy) {
        this.orderBy = orderBy;
    }

    public String getBackCode1() {
        return backCode1;
    }

    public void setBackCode1(String backCode1) {
        this.backCode1 = backCode1 == null ? null : backCode1.trim();
    }

    public String getBackCode2() {
        return backCode2;
    }

    public void setBackCode2(String backCode2) {
        this.backCode2 = backCode2 == null ? null : backCode2.trim();
    }

    public String getBackCode3() {
        return backCode3;
    }

    public void setBackCode3(String backCode3) {
        this.backCode3 = backCode3 == null ? null : backCode3.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}