package com.xin.mapper;

import com.xin.pojo.Student;
import com.xin.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * java类简单作用描述
 *
 * @Author: zhang
 * @CreateDate: 2020/9/27 11:48
 * @Version: 1.0
 * <p>Copyright: Copyright (c) 2020</p>
 */
public class StudentMapperTest {
    @Test
    public void getStudentTeacher(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> student = mapper.getStudentTeacher();
        for (Student student1 : student) {
            System.out.println(student1);
        }
        sqlSession.close();

    }
    @Test
    public void getStudentTeacher2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentTeacher2 = mapper.getStudentTeacher2();
        for (Student student : studentTeacher2) {
            System.out.println(student);
        }
        sqlSession.close();
    }
}
