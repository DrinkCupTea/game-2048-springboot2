package cn.xie.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworld {

    @GetMapping("/hello")
    private String helloWorld() {
        return "Hello World";
    }
}
