package com.janhe.blog.service.impl;

import com.janhe.blog.mapper.SysUserMapper;
import com.janhe.blog.pojo.SysUser;
import com.janhe.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @CLASSNAME UserServiceImpl
 * @Description
 * @Auther Jan  何康宁Aua
 * @DATE 2019/3/14 0014 20:53
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    SysUserMapper sysUserMapper;

    @Cacheable(value = "sysUer"  )
    public SysUser getUser(String oid)
    {

        return sysUserMapper.selectByPrimaryKey(oid);
    }
}
