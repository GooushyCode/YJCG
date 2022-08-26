package com.yijia.management.mapper;
import com.yijia.management.common.ServerResponse;
import com.yijia.management.vo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    ServerResponse<User> login(String username, String password);
    User findAll();
    String saveUser(User user);
    int checkUsername(String username);
    User selectLogin(@Param("username") String username, @Param("password") String password);
}
