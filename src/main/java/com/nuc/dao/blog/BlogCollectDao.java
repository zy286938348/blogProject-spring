package com.nuc.dao.blog;

import com.nuc.bean.Blog;
import com.nuc.bean.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 博客收藏
 */

@Repository
public interface BlogCollectDao {

    //*************************** select ***************************

    /**
     * 用户收藏的博客
     * @param lId
     * @return
     */
    List<Blog> getBlogByLId(int lId);

    /**
     * 收藏博客的用户信息
     * @param bId
     * @return
     */
    List<User> getUserByBId(int bId);

    //*************************** insert ***************************

    //*************************** delete ***************************

    //*************************** update ***************************
}
