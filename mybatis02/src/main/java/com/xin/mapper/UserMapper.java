package com.xin.mapper;

import com.xin.pojo.User;

import java.util.List;

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

    // 根据ID查询用户
    User getUserById(int i);

    // insert用户
    int addUser(User user);

    // 修改用户
    int updateUser(User user);

    // 删除用户
    int deleteUserById(int id);
}
