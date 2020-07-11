package com.nuc.dao.blog;

import com.nuc.bean.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 博客点赞
 */
@Repository
public interface BlogLikeDao {

    //***************************select***************************

    /**
     * 获取博客点赞量
     * @param bId
     * @return
     */
    int getLikeNum(int bId);

    /**
     * 获取点赞用户信息
     * @param bId
     * @return
     */
    List<User> getLikeUser(int bId);

    /**
     * 获取用户点赞的博客
     * @param lId
     * @return
     */
    List<User> getLikeBlog(int lId);

    //*************************** insert ***************************

    /**
     * 点赞
     * @param bId
     * @param lId
     * @return
     */
    int insertLike(int bId,int lId);

    //*************************** delete ***************************

    /**
     * 取消点赞
     * @param bId
     * @param lId
     * @return
     */
    int cancelLike(int bId,int lId);


}
