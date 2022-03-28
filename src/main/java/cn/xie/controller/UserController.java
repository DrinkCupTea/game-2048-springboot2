package cn.xie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.xie.entity.User;
import cn.xie.mapper.UserMapper;

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @PostMapping("/login")
    private boolean login(String username, String passwd) {
        User user = userMapper.selectByUsername(username);
        return user.getPasswd().equals(passwd);
    }
}
