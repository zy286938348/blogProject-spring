package com.nuc.dao.login;

import com.nuc.service.login.LoginService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        LoginService loginService = (LoginService) applicationContext.getBean("loginServiceImpl");
        loginService.login();
    }
}
