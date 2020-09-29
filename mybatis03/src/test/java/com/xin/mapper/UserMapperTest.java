package com.xin.mapper;

import com.xin.pojo.User;
import com.xin.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.Date;
import java.util.List;

/**
 * java类简单作用描述
 *
 * @Author: zhang
 * @CreateDate: 2020/9/28 17:29
 * @Version: 1.0
 * <p>Copyright: Copyright (c) 2020</p>
 */
public class UserMapperTest {
    private static Logger logger = Logger.getLogger(UserMapperTest.class);
    @Test
    public void add() throws Exception{
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setId("4");
        user.setUserCode("zhaoming");
        user.setAddress("山西省临汾市");
        user.setUserName("赵敏");
        user.setBirthday(new Date());
        user.setGender("1");
        user.setPhone("18234512354");
        user.setCreatedBy("超级管理员");
        user.setUserRole("1");
        user.setCreationDate(new Date());
        int add = mapper.add(user);
        if (add>0){
            logger.info("新增用户成功！");
        }
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void getLoginUser() throws Exception{
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User zhaoming = mapper.getLoginUser("zhaoming1");
        System.out.println(zhaoming);
        sqlSession.close();
    }
    @Test
    public void getUserList() throws Exception{
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> list = mapper.getUserList("赵敏", 0, 0, 3);
        for (User user : list) {
            System.out.println(user);
        }
        sqlSession.close();


    }
    @Test
    public void getUserCount() throws Exception{
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int count = mapper.getUserCount("赵敏", 1);
        System.out.println(count);
        sqlSession.close();
    }
    @Test
    public void getUserById() throws Exception{
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User userById = mapper.getUserById(1);
        System.out.println(userById);
        sqlSession.close();
    }
    @Test
    public void deleteUserById() throws Exception{
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.deleteUserById(4);
        if (i>0){
            logger.info("删除用户成功！");
        }
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void modify() throws Exception{
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setId("2");
      //  user.setUserPassword("000000");
        user.setUserRole("0");
        user.setModifyBy("超级管理员");
        user.setModifyDate(new Date());
        int modify = mapper.modify(user);
        if (modify>0){
            logger.info("修改用户成功！");
        }
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void updatePwd() throws Exception{
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.updatePwd(1, "111");
        if (i>0){
            logger.info("修改用户密码成功！");
        }
        sqlSession.commit();
        sqlSession.close();
    }

}
