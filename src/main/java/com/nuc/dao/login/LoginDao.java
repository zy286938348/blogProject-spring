package com.nuc.dao.login;

import com.nuc.bean.Login;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoginDao {

    //*************************** select ***************************

    /**
     * 账号登录
     * @param login
     * @return
     */
    Login loginByAccountNum(Login login);

    /**
     * QQ登录
     * @param login
     * @return
     */
    int loginByQQ(Login login);

    /**
     * 微信登录
     * @param login
     * @return
     */
    int loginByWeChat(Login login);

    /**
     * 邮箱登录
     * @param login
     * @return
     */
    int loginByEmail(Login login);

    List<Login> getList();

    //*************************** insert ***************************

    /**
     * 注册（需返回主键）
     * @param login
     * @return
     */
    Login insertLogin(Login login);

    //*************************** delete ***************************

    //*************************** update ***************************

}
