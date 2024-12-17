package com.blog.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.blog.system.domain.entity.SysUser;
import com.blog.system.mapper.SysUserMapper;
import com.blog.system.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户信息表(SysUser)服务层实现
 *
 * @author nhh
 */
@Service("sysUserService")
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;


    @Override
    public SysUser selectUserByUserName(String userName) {
        return null;
    }
}
