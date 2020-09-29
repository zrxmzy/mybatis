package com.xin.utils;

import org.junit.Test;

import java.util.UUID;

/**
 * java类简单作用描述
 *
 * @Author: zhang
 * @CreateDate: 2020/9/27 16:25
 * @Version: 1.0
 * <p>Copyright: Copyright (c) 2020</p>
 */
public class IDUtil {
    public static String getID(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }
    @Test
    public void test(){
        System.out.println(IDUtil.getID());
    }
}
