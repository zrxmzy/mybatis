package com.xin.mapper;

import com.xin.pojo.Blog;

import java.util.List;
import java.util.Map;

/**
 * java类简单作用描述
 *
 * @Author: zhang
 * @CreateDate: 2020/9/27 16:18
 * @Version: 1.0
 * <p>Copyright: Copyright (c) 2020</p>
 */
public interface BlogMapper {
    int addBlog(Blog blog);
    List<Blog> queryBlogIF(Map<Object,Object> params);
    List<Blog> queryBlogChoose(Map<Object,Object> params);
    List<Blog> queryBlogForEach(Map map);
    int updateBlog(Map map);
}
