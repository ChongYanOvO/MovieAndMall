package com.mars.entity;

import lombok.Data;

import java.util.Date;

@Data
public class MallUser {
    //用户主键id
    private Long userId;
    //用户昵称
    private String nickName;
    //登陆名称(默认为手机号)
    private String loginName;
    //密码
    private String password;
    //个性签名
    private String introduceSign;
    //注销标识字段(0-正常 1-已注销)
    private Integer isDeleted;
    //锁定标识字段(0-未锁定 1-已锁定)
    private Integer lockedFlag;
    //注册时间
    private Date createTime;
    //修改时间
    private Date updateTime;

}

