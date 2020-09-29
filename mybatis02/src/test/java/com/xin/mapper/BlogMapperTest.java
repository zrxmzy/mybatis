package com.xin.mapper;

import com.xin.pojo.Blog;
import com.xin.utils.IDUtil;
import com.xin.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;

/**
 * java类简单作用描述
 *
 * @Author: zhang
 * @CreateDate: 2020/9/27 16:23
 * @Version: 1.0
 * <p>Copyright: Copyright (c) 2020</p>
 */
public class BlogMapperTest {
    @Test
    public void addBlog(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog = new Blog();
        blog.setId(IDUtil.getID());
        blog.setTitle("Mybatis如此简单");
        blog.setAuthor("狂神说");
        blog.setCreatetime(new Date());
        blog.setViews(1000);
        mapper.addBlog(blog);
        blog.setId(IDUtil.getID());
        blog.setTitle("Java如此简单");
        mapper.addBlog(blog);
        blog.setId(IDUtil.getID());
        blog.setTitle("Spring如此简单");
        mapper.addBlog(blog);
        blog.setId(IDUtil.getID());
        blog.setTitle("微服务如此简单");
        mapper.addBlog(blog);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void queryBlogByIF(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map map = new HashMap();
        // map.put("author","狂神说");
         map.put("views","9999");
        List list = mapper.queryBlogIF(map);
        for (Object o : list) {
            System.out.println(o);
        }
        sqlSession.close();
    }
    @Test
    public void queryBlogChoose(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map map = new HashMap();
        map.put("title","Java");
        map.put("views","9999");
        List list = mapper.queryBlogChoose(map);
        for (Object o : list) {
            System.out.println(o);
        }
        sqlSession.close();
    }
    @Test
    public void queryBlogForEach(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map map = new HashMap();
        ArrayList list = new ArrayList();
        list.add("1");
        list.add("2");
        map.put("ids",list);
        List<Blog> blogs = mapper.queryBlogForEach(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }
    @Test
    public void updateBlog(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map map = new HashMap();
        //  map.put("title","Mybatis如此简单");
        map.put("views","1000");
        map.put("id","4f426e59677a4dc9bd95390edad712e4");
        mapper.updateBlog(map);
        sqlSession.commit();
        sqlSession.close();
    }
}
