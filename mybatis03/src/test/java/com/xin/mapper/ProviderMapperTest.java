package com.xin.mapper;

import com.xin.pojo.Provider;
import com.xin.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.Date;
import java.util.List;

/**
 * java类简单作用描述
 *
 * @Author: zhang
 * @CreateDate: 2020/9/28 15:55
 * @Version: 1.0
 * <p>Copyright: Copyright (c) 2020</p>
 */
public class ProviderMapperTest {
    private static Logger logger = Logger.getLogger(ProviderMapperTest.class);
    @Test
    public void add() throws Exception {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        ProviderMapper mapper = sqlSession.getMapper(ProviderMapper.class);
        Provider provider = new Provider("3","003","江苏奥喜埃化工","化工原料、产品等","","035700001","江苏省泰州市"
                ,"","超级管理员",new Date(),"",new Date());
        int add = mapper.add(provider);
        if (add>0){
            logger.info("新增供应商成功！");
        }
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void getProviderList() throws Exception{
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        ProviderMapper mapper = sqlSession.getMapper(ProviderMapper.class);
        List<Provider> providerList = mapper.getProviderList("杭州");
        for (Provider provider : providerList) {
            System.out.println(provider);
        }
        sqlSession.close();
    }
    @Test
    public void getProviderById()  throws Exception{
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        ProviderMapper mapper = sqlSession.getMapper(ProviderMapper.class);
        Provider providerById = mapper.getProviderById("1");
        System.out.println(providerById);
        sqlSession.close();
    }
    @Test
    public void deleteProvideById() throws Exception{
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        ProviderMapper mapper = sqlSession.getMapper(ProviderMapper.class);
        int i = mapper.deleteProvideById(3);
        if (i>0){
            logger.info("删除供应商成功！");
        }
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void modify() throws Exception{
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        ProviderMapper mapper = sqlSession.getMapper(ProviderMapper.class);
        Provider provider = new Provider();
        provider.setId("1");
        provider.setProContact("信息技术支持，物流仓储系统");
        provider.setModifyBy("超级管理员");
        provider.setModifyDate(new Date());
        int modify = mapper.modify(provider);
        if (modify>0){
            logger.info("修改供应商成功！");
        }
        sqlSession.commit();
        sqlSession.close();
    }
}
