package com.xin.pojo;

import lombok.Data;

import java.util.List;

/**
 * java类简单作用描述
 *
 * @Author: zhang
 * @CreateDate: 2020/9/27 11:27
 * @Version: 1.0
 * <p>Copyright: Copyright (c) 2020</p>
 */
@Data
public class Teacher {
    private int id;
    private String name;
    private List<Student> students;
}
