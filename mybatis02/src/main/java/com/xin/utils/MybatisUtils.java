package com.xin.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * java类简单作用描述
 *
 * @Author: zhang
 * @CreateDate: 2020/9/23 15:47
 * @Version: 1.0
 * <p>Copyright: Copyright (c) 2020</p>
 */
public class MybatisUtils {
    private static SqlSessionFactory sqlSessionFactory;
    static {
        try {
            String resource = "mybatis-config.xml"; // 读取配置文件
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream); // 获取sqlsessionFactory
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取sqlsession
     * @return
     */
    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }
}
