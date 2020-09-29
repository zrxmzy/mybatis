package com.xin.mapper;

import com.xin.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * java类简单作用描述
 *
 * @Author: zhang
 * @CreateDate: 2020/9/28 14:37
 * @Version: 1.0
 * <p>Copyright: Copyright (c) 2020</p>
 */
public interface UserMapper {
    /**
     * 增加用户
     * @param user
     * @return
     * @throws Exception
     */
    int add(User user) throws Exception;
    /**
     * 通过userCode获取User
     * @param userCode
     * @return
     * @throws Exception
     */
    User getLoginUser(@Param("userCode") String userCode) throws Exception;
    /**
     * 通过条件查询-userList
     * @param userName
     * @param userRole
     * @return
     * @throws Exception
     */
    List<User> getUserList(@Param("userName") String userName, @Param("userRole") int userRole, @Param("currentPageNo")int currentPageNo, @Param("pageSize")int pageSize)throws Exception;
    /**
     * 通过条件查询-用户表记录数
     * @param userName
     * @param userRole
     * @return
     * @throws Exception
     */
    int getUserCount(@Param("userName") String userName, @Param("userRole")int userRole)throws Exception;
    /**
     * 通过userId获取user
     * @param id
     * @return
     * @throws Exception
     */
    User getUserById(int id)throws Exception;
    /**
     * 通过userId删除user
     * @param delId
     * @return
     * @throws Exception
     */
    int deleteUserById(Integer delId)throws Exception;
    /**
     * 修改用户信息
     * @param user
     * @return
     * @throws Exception
     */
    int modify( User user)throws Exception;
    /**
     * 修改当前用户密码
     * @param id
     * @param pwd
     * @return
     * @throws Exception
     */
    int updatePwd(@Param("id") int id, @Param("userPassword") String pwd)throws Exception;
}
