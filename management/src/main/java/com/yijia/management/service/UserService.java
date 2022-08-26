package com.yijia.management.service;
import com.yijia.management.common.ServerResponse;
import com.yijia.management.mapper.UserMapper;
import com.yijia.management.vo.User;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    public ServerResponse<User> login(String username,String password){
        int resultCount = userMapper.checkUsername(username);
        if (resultCount == 0){
            return ServerResponse.createByErrorMessage("用户名不存在");
        }

        User user = userMapper.selectLogin(username, password);
        if (user == null){
            return ServerResponse.createByErrorMessage("密码错误");
        }
        user.setPassword(StringUtils.EMPTY);
        return ServerResponse.createBySuccess("登录成功!",user);
    }

    public User findAll(){
        return userMapper.findAll();
    }

    public String saveUser(User user){
        return userMapper.saveUser(user);
    }
}
