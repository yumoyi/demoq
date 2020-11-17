package com.test.demoq.controller;


import com.test.demoq.entity.User;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author cy
 * @since 2020-11-16
 */

@RestController
@RequestMapping("/demoq/user")
public class UserController {

    @ApiOperation(value = "hello控制类")
    @GetMapping(value = "/hello")
    public String hello(){
        return "hello!";
    }

    @PostMapping(value = "/user")
    public User user(){
        return new User();
    }

    @PostMapping(value = "/user1")
    public User user1(User user){
        return user;
    }

    @ApiOperation(value = "hello控制类2")
    @PostMapping(value = "/hello2")
    public String hello2(@ApiParam(value = "用户名") String username)
    {
        return "hello!"+username;
    }
}

