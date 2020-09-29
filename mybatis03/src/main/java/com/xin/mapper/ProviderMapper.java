package com.xin.mapper;

import com.xin.pojo.Provider;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 供应商mapper
 *
 * @Author: zhang
 * @CreateDate: 2020/9/28 14:09
 * @Version: 1.0
 * <p>Copyright: Copyright (c) 2020</p>
 */
public interface ProviderMapper {
    /**
     * 增加供应商
     * @param provider
     * @return
     * @throws Exception
     */
    int add(Provider provider) throws Exception;
    /**
     * 通过供应商名称、编码获取供应商列表-模糊查询-getProviderList
     * @param proName
     * @return
     * @throws Exception
     */
    List<Provider> getProviderList(@Param("proName") String proName) throws Exception;
    /**
     * 通过proId获取Provider
     * @param id
     * @return
     * @throws Exception
     */
    Provider getProviderById(@Param("id") String id) throws Exception;
    /**
     * 通过proId删除Provider
     * @param id
     * @return
     * @throws Exception
     */
    int deleteProvideById(@Param("delId") int id) throws Exception;
    /**
     * 修改用户信息
     * @param provider
     * @return
     * @throws Exception
     */
    int modify(Provider provider) throws Exception;

}
