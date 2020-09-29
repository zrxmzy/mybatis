package com.xin.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;

/**
 * Mybatis连接数据库 获取sqlsession
 * 1、读取配置文件
 * 2、获取资源  # Resources.getResourceAsStream(resource)
 * 3、获取 SqlSessionFactory # new SqlSessionFactoryBuilder().build(inputStream)
 * 4、获取 SqlSession #sqlSessionFactory.openSession()
 * @Author: zhang
 * @CreateDate: 2020/9/28 11:29
 * @Version: 1.0
 * <p>Copyright: Copyright (c) 2020</p>
 */
public class MyBatisUtil {
    private static SqlSessionFactory sqlSessionFactory;
    static {
        try {
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * 获取 SqlSession
     * @return
     */
    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }

    @Test
    public void test(){
        SqlSession sqlSession = getSqlSession();
        System.out.println(sqlSession);
    }
}
