package com.blog.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.blog.system.domain.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author nhh
 */
@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {
}
