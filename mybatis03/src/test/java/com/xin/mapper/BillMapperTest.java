package com.xin.mapper;

import com.xin.pojo.Bill;
import com.xin.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * java类简单作用描述
 *
 * @Author: zhang
 * @CreateDate: 2020/9/28 15:38
 * @Version: 1.0
 * <p>Copyright: Copyright (c) 2020</p>
 */
public class BillMapperTest {
    private static Logger logger = Logger.getLogger(BillMapperTest.class);
    @Test
    public void add() throws Exception {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        BillMapper mapper = sqlSession.getMapper(BillMapper.class);
        Bill bill = new Bill("3","C002","笔记本","研发部门使用物资","台","10","80000","2000","超级管理员",new Date(),"",new Date(),"1");
        int add = mapper.add(bill);
        if (add>0){
            logger.info("新增订单成功！");
        }
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void modify() throws Exception{
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        BillMapper mapper = sqlSession.getMapper(BillMapper.class);
        Map map = new HashMap();
        map.put("id",1);
        //   map.put("productName","键盘");
        //   map.put("productDesc","物资存储");
        //  map.put("productUnit","套");
        //  map.put("totalPrice","2000");
        //  map.put("isPayment","2000");
        //  map.put("isPayment","2000");
        map.put("productCount","5");
        map.put("modifyBy","超级管理员");
        map.put("modifyDate",new Date());
        int modify = mapper.modify(map);
        if (modify>0){
            logger.info("修改订单信息成功！");
        }
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void getBillList() throws Exception{
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        BillMapper mapper = sqlSession.getMapper(BillMapper.class);
        Bill bill = new Bill();
     //   bill.setBillCode("C001");
     //   bill.setId("1");
     //   bill.setProductName("笔记");
        bill.setProductDesc("物资");
        List<Bill> billList = mapper.getBillList(bill);
        for (Bill bill1 : billList) {
            System.out.println(bill1);
        }
        sqlSession.close();
    }
    @Test
    public void getBillById() throws Exception{
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        BillMapper mapper = sqlSession.getMapper(BillMapper.class);
        Bill billById = mapper.getBillById("1");
        System.out.println(billById);
        sqlSession.close();
    }
    @Test
    public void deleteBillById() throws Exception{
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        BillMapper mapper = sqlSession.getMapper(BillMapper.class);
        int i = mapper.deleteBillById("3");
        if (i>0){
            logger.info("删除订单成功！");
        }
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void getBillCountByProviderId() throws Exception{
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        BillMapper mapper = sqlSession.getMapper(BillMapper.class);
        int billCountByProviderId = mapper.getBillCountByProviderId("1");
        System.out.println(billCountByProviderId);
        sqlSession.close();
    }
}
