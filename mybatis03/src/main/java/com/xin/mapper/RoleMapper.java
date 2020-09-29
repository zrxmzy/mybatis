package com.xin.mapper;

import com.xin.pojo.Role;

import java.util.List;

/**
 * java类简单作用描述
 *
 * @Author: zhang
 * @CreateDate: 2020/9/28 14:35
 * @Version: 1.0
 * <p>Copyright: Copyright (c) 2020</p>
 */
public interface RoleMapper {
    int add(Role role) throws Exception;
    List<Role> getRoleList() throws Exception;
}
