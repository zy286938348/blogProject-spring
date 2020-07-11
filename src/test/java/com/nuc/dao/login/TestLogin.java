package com.nuc.dao.login;

import com.nuc.bean.Login;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

public class TestLogin {
//    private InputStream resourceAsStream = null;
//    SqlSessionFactoryBuilder builder = null;
//    SqlSessionFactory factory = null;
//    SqlSession sqlSession = null;
//    LoginDao loginDao = null;
//    @Before
//    public void init() throws Exception{
//        //        读取配置文件
//        resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
////        创建SqlSessionFactory
//        builder = new SqlSessionFactoryBuilder();
//        factory = builder.build(resourceAsStream);
////        使用工厂创建SqlSession对象
//        sqlSession = factory.openSession();
////        使用SqlSession创建dao接口的代理对象
//        loginDao = sqlSession.getMapper(LoginDao.class);
//    }
//
//    @Test
//    public void test(){
//        Login login = new Login();
//        login.setAccountNumber("zhangsan");
//        login.setPassword("123456");
//        Login l = loginDao.loginByAccountNum(login);
//        System.out.println(l);
//    }
//
//    @After
//    public void desdroy() throws Exception{
//        //释放资源
//        sqlSession.commit();
//        sqlSession.close();
//        resourceAsStream.close();
//    }
}
