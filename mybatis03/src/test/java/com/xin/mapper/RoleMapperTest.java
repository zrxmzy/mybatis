package com.xin.mapper;

import com.xin.pojo.Role;
import com.xin.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.List;


/**
 * java类简单作用描述
 *
 * @Author: zhang
 * @CreateDate: 2020/9/28 15:10
 * @Version: 1.0
 * <p>Copyright: Copyright (c) 2020</p>
 */
public class RoleMapperTest {
    private static Logger logger = Logger.getLogger(RoleMapperTest.class);
    @Test
    public void add() {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        RoleMapper mapper = sqlSession.getMapper(RoleMapper.class);
        Role role = new Role("2","A02","角色2");
        int add = 0;
        try {
            add = mapper.add(role);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (add > 0) {
           logger.info("新增角色成功！");
        }
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void getRoleList() throws Exception {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        RoleMapper mapper = sqlSession.getMapper(RoleMapper.class);
        List<Role> roleList = mapper.getRoleList();
        for (Role role : roleList) {
            System.out.println(role);
        }
        sqlSession.close();
    }
}
