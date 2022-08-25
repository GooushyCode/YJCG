package com.yijia.management.mapper;
import com.yijia.management.vo.User;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface UserMapper {
    int login(String username,String password);
    User findAll();
    String saveUser(User user);
}
