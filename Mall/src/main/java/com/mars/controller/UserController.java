package com.mars.controller;

import com.mars.entity.AdminUser;
import com.mars.entity.MallUser;
import com.mars.service.AdminUserService;
import com.mars.service.MallUserService;
import com.mars.utils.ErrorCodeEnum;
import com.mars.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/user")
public class UserController {

    @Autowired
    private MallUserService mallUserService;

    @Autowired
    private AdminUserService adminUserService;

    @PostMapping("login")
    public Result login(@RequestBody MallUser mallUser) {
        if (mallUser != null) {
            String token = mallUserService.login(mallUser);
            if (token != null) {
                return new Result(ErrorCodeEnum.SUCCESS.getCode(), ErrorCodeEnum.SUCCESS.getDescription(), token);
            }
        }
        return new Result(ErrorCodeEnum.USER_ERROR_A0201.getCode(), ErrorCodeEnum.USER_ERROR_A0201.getDescription(), null);
    }

    @PostMapping("adminLogin")
    public Result loginAdmin(@RequestBody AdminUser adminUser) {
        if (adminUser != null) {
            String token = adminUserService.login(adminUser);
            if (token != null) {
                return new Result(ErrorCodeEnum.SUCCESS.getCode(), ErrorCodeEnum.SUCCESS.getDescription(), token);
            }
        }
        return new Result(ErrorCodeEnum.USER_ERROR_A0201.getCode(), ErrorCodeEnum.USER_ERROR_A0201.getDescription(), null);
    }

    @GetMapping("test")
    public String test() {
        return "test";
    }
}
