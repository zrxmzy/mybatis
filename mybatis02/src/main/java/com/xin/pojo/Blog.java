package com.xin.pojo;


import lombok.Data;

import java.util.Date;


/**
 * java类简单作用描述
 *
 * @Author: zhang
 * @CreateDate: 2020/9/27 16:18
 * @Version: 1.0
 * <p>Copyright: Copyright (c) 2020</p>
 */
@Data
public class Blog {
    private String id;
    private String title;
    private String author;
    private Date createtime;
    private int views;
}
