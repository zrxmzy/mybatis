package com.xin.mapper;

import com.xin.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * java类简单作用描述
 *
 * @Author: zhang
 * @CreateDate: 2020/9/27 11:29
 * @Version: 1.0
 * <p>Copyright: Copyright (c) 2020</p>
 */
public interface TeacherMapper {
    @Select("select * from mybatis.teacher")
    List<Teacher> getTeacherList();
    List<Teacher> getTeacher();
    Teacher getTeacherById(@Param("id") int id);
    Teacher getTeacherById2(@Param("id") int id);
}
