package com.xin.mapper;

import com.xin.pojo.User;
import com.xin.utils.MybatisUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * java类简单作用描述
 *
 * @Author: zhang
 * @CreateDate: 2020/9/23 16:42
 * @Version: 1.0
 * <p>Copyright: Copyright (c) 2020</p>
 */
public class UserMapperTest {
    static Logger logger = Logger.getLogger(UserMapperTest.class);
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
        System.out.println("==========");

      /*  // 增删改会清除一级缓存
        mapper.updateUser(new User(2,"many","000000"));
        sqlSession.commit();
       // sqlSession.clearCache();
        System.out.println("==========");
        */
        SqlSession sqlSession2 = MybatisUtils.getSqlSession();
        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);
        User user1 = mapper2.getUserById(1);
        System.out.println(user1);
        sqlSession2.close();
    }
    @Test
    public void getUserLimt(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("startIndex",1);
        map.put("pageSize",3);
        List<User> userLimit = mapper.getUserLimit(map);
        for (User user : userLimit) {
            System.out.println(user);
        }
        sqlSession.close();
    }
    @Test
    public void getUserByRowBons(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        RowBounds rowBounds = new RowBounds(1, 3);
        List<Object> objects = sqlSession.selectList("com.xin.mapper.UserMapper.getUserByRowBons", null, rowBounds);
        for (Object object : objects) {
            System.out.println(object);
        }
        sqlSession.close();
    }
    @Test
    public void getUsers(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.getUsers();
        for (User user : users) {
            System.out.println(user);
        }
        sqlSession.close();
    }
    @Test
    public void addUser(){
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
    public void addUserMap(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<Object, Object> map = new HashMap<Object, Object>();
        map.put("id",6);
        map.put("name","hehe");
        map.put("password","111111");
        int i = mapper.addUserMap(map);
        if (i>0){
            System.out.println("传参Map新增用户成功！");
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
    @Test
    public void testLog4j(){
        logger.info("info 进入testing");
        logger.debug("debug 进入testing");
        logger.error("error 进入testing");
    }
    /**
     * 使用注解 增删改查
     */
    @Test
    public void getUserByIdParams(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User userByIdParams = mapper.getUserByIdParams(1);
        System.out.println(userByIdParams);
        sqlSession.close();
    }
    @Test
    public void addUserParams(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(7,"哈哈","000000");
        int i = mapper.addUserParams(user);
        if (i>0){
            logger.info("新增用户成功！");
        }
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void updateUserParams(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(7,"呵呵","111111");
        int i = mapper.updateUserParams(user);
        if (i>0){
            logger.info("修改用户成功！");
        }
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void deleteUserParams(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.deleteUserParams("7");
        if (i>0){
            logger.info("删除用户成功！");
        }
        sqlSession.commit();
        sqlSession.close();

    }
}
