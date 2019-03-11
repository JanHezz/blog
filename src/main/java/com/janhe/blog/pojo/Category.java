package com.janhe.blog.pojo;

import java.util.Date;

public class Category {
    private String oid;

    private String name;

    private Integer level;

    private String parentId;

    private Integer orderBy;

    private Date createTime;

    private Date updateTime;

    private String enableTag;

    private String createUser;

    private String caInfo;

    private String icon;

    private String backCode1;

    private String backCode2;

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid == null ? null : oid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public Integer getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(Integer orderBy) {
        this.orderBy = orderBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getEnableTag() {
        return enableTag;
    }

    public void setEnableTag(String enableTag) {
        this.enableTag = enableTag == null ? null : enableTag.trim();
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public String getCaInfo() {
        return caInfo;
    }

    public void setCaInfo(String caInfo) {
        this.caInfo = caInfo == null ? null : caInfo.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
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
}