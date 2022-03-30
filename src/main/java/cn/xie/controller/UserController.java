package cn.xie.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.xie.entity.User;
import cn.xie.mapper.UserMapper;

@CrossOrigin
@RestController
public class UserController {
    @Resource
    private UserMapper userMapper;

    @PostMapping("/login")
    private boolean login(String username, String passwd) {
        User user = userMapper.selectByUsername(username);
        if (user == null) {
            return false;
        }
        return user.getPasswd().equals(passwd);
    }
}
