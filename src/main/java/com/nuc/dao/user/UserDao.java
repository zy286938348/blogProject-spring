package com.nuc.dao.user;

import com.nuc.bean.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    //*************************** select ***************************

    /**
     * 获取用户列表
     * @return
     */
    List<User> getUserList();

    /**
     * 获取用户信息
     * @param lId
     * @return
     */
    User getUser(int lId);

    //*************************** insert ***************************

    /**
     * 完善用户信息
     * @param user
     * @return
     */
    int insertUser(User user);

    /**
     * 关注用户
     * @param lId 用户登录id
     * @param fLId 被关注用户登录id
     * @return
     */
    int attentionUser(int lId,int fLId);

    //*************************** delete ***************************

    /**
     * 取消关注
     * @param lId 用户登录id
     * @param fLId 被关注用户登录id
     * @return
     */
    int cancelAttentionUser(int lId,int fLId);

    //*************************** update ***************************

    /**
     * 修改用户信息
     * @param user
     * @return
     */
    int updateUser(User user);

}
