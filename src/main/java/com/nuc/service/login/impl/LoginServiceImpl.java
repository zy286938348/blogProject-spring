package com.nuc.service.login.impl;

import com.nuc.bean.Login;
import com.nuc.dao.login.LoginDao;
import com.nuc.service.login.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("loginServiceImpl")
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginDao loginDao;

    @Override
    public void login() {
        System.out.println("服务层，登录校验中....");
        Login login = new Login();
        login.setAccountNumber("zhangsan");
        login.setPassword("123456");
        Login login1 = loginDao.loginByAccountNum(login);
        System.out.println(login1);
        List<Login> list = loginDao.getList();
        for (Login l: list
        ) {
            System.out.println(l);
        }
    }
}
