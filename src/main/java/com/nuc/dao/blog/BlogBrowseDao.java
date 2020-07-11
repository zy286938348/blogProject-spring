package com.nuc.dao.blog;

import org.springframework.stereotype.Repository;

/**
 * 博客浏览量
 */

@Repository
public interface BlogBrowseDao {

    //*************************** select ***************************

    /**
     * 获取博客浏览量
     * @param bId
     * @return
     */
    int getBlogBrowse(int bId);

    //*************************** insert ***************************

    /**
     * 增加博客浏览量
     * @param bId
     * @return
     */
    int changeBlogBrowse(int bId);

    //*************************** delete ***************************

    //*************************** update ***************************

}
