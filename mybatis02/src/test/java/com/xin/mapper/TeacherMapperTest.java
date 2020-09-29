package com.xin.mapper;

import com.xin.pojo.Teacher;
import com.xin.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * java类简单作用描述
 *
 * @Author: zhang
 * @CreateDate: 2020/9/27 11:36
 * @Version: 1.0
 * <p>Copyright: Copyright (c) 2020</p>
 */
public class TeacherMapperTest {
    @Test
    public void getTeacherList(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> teacherList =  mapper.getTeacherList();
        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
        }
        sqlSession.close();


    }
    @Test
    public void getTeacher(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> teacher = mapper.getTeacher();
        for (Teacher teacher1 : teacher) {
            System.out.println(teacher1);
        }
        sqlSession.close();
    }
    @Test
    public void getTeacherById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacherById = mapper.getTeacherById(1);
        System.out.println(teacherById);
        sqlSession.close();
    }
    @Test
    public void getTeacherById2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacherById2 = mapper.getTeacherById2(1);
        System.out.println(teacherById2);
        sqlSession.close();
    }
}
