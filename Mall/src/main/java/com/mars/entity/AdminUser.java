package com.mars.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;

/**
 * (AdminUser)表实体类
 *
 * @author marsOvO
 * @since 2021-12-26 19:37:48
 */
@SuppressWarnings("serial")
@Data
public class AdminUser extends Model<AdminUser> {
    //管理员id
    private Long adminUserId;
    //管理员登陆名称
    private String loginUserName;
    //管理员登陆密码
    private String loginPassword;
    //管理员显示昵称
    private String nickName;
    //是否锁定 0未锁定 1已锁定无法登陆
    private Integer locked;


    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.adminUserId;
    }
    }

