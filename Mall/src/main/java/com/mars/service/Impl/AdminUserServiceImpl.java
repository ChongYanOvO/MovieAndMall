package com.mars.service.Impl;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mars.entity.AdminUser;
import com.mars.mapper.AdminUserMapper;
import com.mars.service.AdminUserService;
import com.mars.utils.JwtUtil;
import org.springframework.stereotype.Service;

@Service
public class AdminUserServiceImpl extends ServiceImpl<AdminUserMapper, AdminUser> implements AdminUserService  {

    @Override
    public String login(AdminUser adminUser) {
        LambdaQueryWrapper<AdminUser> wrapper = new LambdaQueryWrapper();
        wrapper.eq(AdminUser::getLoginUserName,adminUser.getLoginUserName()).eq(AdminUser::getLoginPassword,adminUser.getLoginPassword());
        AdminUser user = getBaseMapper().selectOne(wrapper);
        if (user != null) {
            return JwtUtil.createToken(JSONObject.parseObject(JSONObject.toJSONString(user)));
        }else {
            return null;
        }
    }
}
