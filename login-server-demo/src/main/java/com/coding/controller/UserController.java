package com.coding.controller;

import com.coding.common.Const;
import com.coding.common.PageParam;
import com.coding.domain.User;
import com.coding.mapper.UserMapper;
import com.coding.service.UserService;
import com.github.pagehelper.PageHelper;
import com.guanweiming.common.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Slf4j
@Api(tags = "用户接口")
@AllArgsConstructor
@RequestMapping(Const.API + "user")
@RestController
public class UserController {

    private final UserService userService;
    private final UserMapper userMapper;


    @ApiOperation("登陆接口，返回用户数据")
    @PostMapping("login")
    public Result<User> login(
            @RequestParam String username,
            @RequestParam String password) {
        return userService.login(username, password);
    }


    @ApiOperation("注册用户接口")
    @PostMapping("register")
    public Result<User> register(@RequestParam String username,
                                 @RequestParam String password,
                                 @RequestParam String User_rights,
                                 String nickname) {
        return userService.addUser(username, password, nickname,nickname);
    }


    @ApiOperation("查询所有用户")
    @GetMapping("allUser")
    public Result<List<User>> allUser(PageParam pageParam) {
        PageHelper.startPage(pageParam.getPage(), pageParam.getSize(), "id desc");
        return Result.createBySuccess(userMapper.selectAll());
    }


}
