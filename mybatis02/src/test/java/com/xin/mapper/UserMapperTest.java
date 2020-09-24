package com.xin.mapper;

import com.xin.pojo.User;
import com.xin.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * java类简单作用描述
 *
 * @Author: zhang
 * @CreateDate: 2020/9/23 16:42
 * @Version: 1.0
 * <p>Copyright: Copyright (c) 2020</p>
 */
public class UserMapperTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void getUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void insertUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(5,"哈哈","111111");
        int i = mapper.addUser(user);
        if (i>0){
            System.out.println("新增用户成功！");
        }
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void updateUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(4,"呵呵","000000");
        int i = mapper.updateUser(user);
        if (i>0){
            System.out.println("修改用户成功！");
        }
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.deleteUserById(5);
        if (i>0){
            System.out.println("删除用户成功！");
        }
        sqlSession.commit();
        sqlSession.close();

    }
}
