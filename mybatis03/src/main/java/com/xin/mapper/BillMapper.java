package com.xin.mapper;

import com.xin.pojo.Bill;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 订单
 *
 * @Author: zhang
 * @CreateDate: 2020/9/28 13:32
 * @Version: 1.0
 * <p>Copyright: Copyright (c) 2020</p>
 */
public interface BillMapper {
    /**
     * 增加订单
     * @param bill
     * @return
     * @throws Exception
     */
    int add(Bill bill) throws Exception;
    /**
     * 通过查询条件获取订单列表-模糊查询-getBillList
     * @param bill
     * @return
     * @throws Exception
     */
    List<Bill> getBillList(Bill bill) throws Exception;
    /**
     * 通过billId获取Bill
     * @param id
     * @return
     * @throws Exception
     */
    Bill getBillById(@Param("id") String id) throws Exception;
    /**
     * 通过delId删除Bill
     * @param delId
     * @return
     * @throws Exception
     */
    int deleteBillById(@Param("id") String delId) throws Exception;
    /**
     * 修改订单信息
     * @param map
     * @return
     * @throws Exception
     */
    int modify(Map map) throws Exception;
    /**
     * 根据供应商Id查找订单数据
     * @param providerId
     * @return
     * @throws Exception
     */
    int getBillCountByProviderId(@Param("providerId") String providerId) throws Exception;
}
