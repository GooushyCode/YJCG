package com.yijia.management.controller;
import com.yijia.management.service.UserService;
import com.yijia.management.vo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

@RestController
public class TestController {
    @Resource
    private UserService userService;

    // 返回hello
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/login")
    public int login(String username,String password){
        return userService.login(username, password);
    }

    @GetMapping("findAll")
    public String findAll(){
        User user = userService.findAll();
        return user.getUsername();
    }

}
