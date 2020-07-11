package com.nuc.test;

import com.nuc.bean.Login;
import com.nuc.dao.login.LoginDao;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TestMybatis {
    @Autowired
    private LoginDao loginDao;

    @Test
    public void test(){
        List<Login> list = loginDao.getList();
        for (Login l: list
             ) {
            System.out.println(l);
        }
    }
}
