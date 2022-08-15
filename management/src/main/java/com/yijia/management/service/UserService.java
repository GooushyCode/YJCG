package com.yijia.management.service;
import com.yijia.management.mapper.UserMapper;
import com.yijia.management.vo.User;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    public int login(String username,String password){
        int sum = userMapper.login(username, password);
        if (sum==1){
            return 1;
        }else {
            return 0;
        }
    }

    public User findAll(){
        return userMapper.findAll();
    }
}
