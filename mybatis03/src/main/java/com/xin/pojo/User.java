package com.xin.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * java类简单作用描述
 *
 * @Author: zhang
 * @CreateDate: 2020/9/28 14:37
 * @Version: 1.0
 * <p>Copyright: Copyright (c) 2020</p>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String id;
    private String userCode;
    private String userName;
    private String userPassword;
    private String gender;
    private Date birthday;
    private String phone;
    private String address;
    private String userRole;
    private String createdBy;
    private Date creationDate;
    private String modifyBy;
    private Date modifyDate;
}
