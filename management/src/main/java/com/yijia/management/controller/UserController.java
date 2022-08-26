package com.yijia.management.controller;
import com.yijia.management.common.Const;
import com.yijia.management.common.ServerResponse;
import com.yijia.management.mapper.UserMapper;
import com.yijia.management.service.UserService;
import com.yijia.management.vo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;


@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    // 用户登录
    @RequestMapping("/login")
    public ServerResponse<User> login(String username, String password,HttpSession session){
        ServerResponse<User> response = userService.login(username, password);
        if (response.isSuccess()){
            session.setAttribute(Const.CURRENT_USER,response.getData());
        }
        return response;
    }

    //退出登录
    @RequestMapping("/logout")
    public ServerResponse<String> logout(HttpSession session){
        session.removeAttribute(Const.CURRENT_USER);
        return ServerResponse.createBySuccess();
    }

    //获取用户登录信息
    @RequestMapping("/get_user_info")
    public ServerResponse<User> getUserInfo(HttpSession session){
        User user = (User) session.getAttribute(Const.CURRENT_USER);
        if (user != null){
            return ServerResponse.createBySuccess(user);
        }
        return ServerResponse.createByErrorMessage("用户未登录,无法获取当前登录用户的信息！");
    }


}
