package com.janhe.blog.service;

import com.janhe.blog.pojo.SysUser;

public interface UserService {

    /**
     * 通过主键获取用户
     * @param oid 主键
     * @return
     */
    public SysUser getUser(String oid);
}
