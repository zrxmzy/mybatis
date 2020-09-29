package com.xin.mapper;

import com.xin.pojo.Student;

import java.util.List;

/**
 * java类简单作用描述
 *
 * @Author: zhang
 * @CreateDate: 2020/9/27 11:29
 * @Version: 1.0
 * <p>Copyright: Copyright (c) 2020</p>
 */
public interface StudentMapper {
    // 查询所有学生的信息以及对应老师的信息
    public List<Student> getStudentTeacher();
    public List<Student> getStudentTeacher2();
}
