package com.xin.mapper;

import com.xin.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * java类简单作用描述
 *
 * @Author: zhang
 * @CreateDate: 2020/9/23 16:38
 * @Version: 1.0
 * <p>Copyright: Copyright (c) 2020</p>
 */
public interface UserMapper {
    // 查询所有的用户
    List<User> getUserList();
    List<User> getUserListLike(String s);
    List<User> getUserListLike2(String s);
    // 根据ID查询用户
    User getUserById(int i);

    // insert用户
    int insertUser(User user);

    // 修改用户
    int updateUser(User user);

    // 删除用户
    int deleteUserById(int id);
}
