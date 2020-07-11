package com.nuc.dao.blog;

import com.nuc.bean.Blog;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 博客主表
 */

@Repository
public interface BlogDao {

    //***************************select***************************

    /**
     * 获取所有博客
     * @return
     */
    List<Blog> getAllBlog();

    /**
     * 获取用户博客
     * @param lId
     * @return
     */
    List<Blog> getBlogByLId(int lId);

    //*************************** insert ***************************

    /**
     * 添加博客
     * @param blog
     * @return
     */
    int insertBlog(Blog blog);

    //*************************** delete ***************************

    /**
     * 删除博客
     * @param bId
     * @return
     */
    int deleteBlog(int bId);

    //*************************** update ***************************

    /**
     * 修改博客
     * @param blog
     * @return
     */
    int updateBlog(Blog blog);

}
