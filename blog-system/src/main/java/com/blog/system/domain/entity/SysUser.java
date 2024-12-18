package com.blog.system.domain.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 用户信息表(SysUser)实体类
 *
 * @author nhh
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("sys_user")
public class SysUser {
    /* 用户ID */
    @TableId
    private Long userId;
    /* 部门ID */
    private Long deptId;
    /* 用户账号 */
    private String userName;
    /* 用户昵称 */
    private String nickName;
    /* 用户类型（00系统用户） */
    private String userType;
    /* 用户邮箱 */
    private String email;
    /* 手机号码 */
    private String phone;
    /* 用户性别（0男 1女 2未知） */
    private String sex;
    /* 头像地址 */
    private String avatar;
    /* 密码 */
    private String password;
    /* 帐号状态（0正常 1停用） */
    private String status;
    /* 删除标志（0代表存在 2代表删除） */
    private String delFlag;
    /* 最后登录IP */
    private String loginIp;
    /* 最后登录时间 */
    private Date loginDate;
    /* 创建者 */
    private String createBy;
    /* 创建时间 */
    private Date createTime;
    /* 更新者 */
    private String updateBy;
    /* 更新时间 */
    private Date updateTime;
    /* 备注 */
    private String remark;
}
