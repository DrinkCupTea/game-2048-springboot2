package cn.xie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.xie.dao.UserDao;
import cn.xie.domain.User;

@RestController
public class UserController {
    @Autowired
    private UserDao userDao;

    @PostMapping("/login")
    private boolean login(String username, String passwd) {
        User user = userDao.getByUsername(username);
        return user.getPasswd().equals(passwd);
    }
}
