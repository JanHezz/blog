package com.janhe.blog.controller.admin;

import com.janhe.blog.mapper.SysUserMapper;
import com.janhe.blog.pojo.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @CLASSNAME LoginController
 * @Description
 * @Auther Jan  何康宁
 * @DATE 2019/3/8 0008 21:17
 */
@Controller
public class LoginController {

    @Autowired
    SysUserMapper userMapper;

    @RequestMapping(value = "/{oid}")
    @ResponseBody
    public SysUser login(@PathVariable("oid") String oid)
    {
      return   userMapper.selectByPrimaryKey(oid);
    }

}
