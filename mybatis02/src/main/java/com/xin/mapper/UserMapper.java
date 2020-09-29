package com.xin.mapper;

import com.xin.pojo.User;
import org.apache.ibatis.annotations.*;

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
    // 根据ID查询用户
    User getUserById(int i);
    // 分页查询
    List<User> getUserLimit(Map<String,Object> map);
    List<User> getUserByRowBons();
    // insert用户
    int addUser(User user);
    int addUserMap(Map<Object,Object> map);
    int addUserAuto(Map<Object,Object> map);
    // 修改用户
    int updateUser(User user);
    // 删除用户
    int deleteUserById(int id);

    @Select("select * from user")
    List<User> getUsers();
    @Select("select * from user where id = #{id}")
    User getUserByIdParams(@Param("id") int id);
    @Insert("insert into mybatis.user(id,name,pwd) values(#{id},#{name},#{pwd})")
    int addUserParams(User user);
    @Update("update mybatis.user set name=#{name},pwd=#{pwd} where id=#{id}")
    int updateUserParams(User user);
    @Delete("delete from mybatis.user where id = #{id}")
    int deleteUserParams(@Param("id") String id);

}
