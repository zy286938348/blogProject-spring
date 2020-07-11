package com.nuc.dao.login;

import com.nuc.bean.Login;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class TestMybatis {

    @Autowired
    private LoginDao loginDao;

    @Test
    public void test(){
        Login login = new Login();
        login.setAccountNumber("zhangsan");
        login.setPassword("123456");
        Login l = null;
        l = loginDao.loginByAccountNum(login);
        System.out.println(l);
    }
}
