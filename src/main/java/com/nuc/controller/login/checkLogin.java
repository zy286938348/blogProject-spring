package com.nuc.controller.login;

import com.nuc.bean.Login;
import com.nuc.service.login.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/login")
public class checkLogin {

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/accountNum",method = RequestMethod.POST)
    @ResponseBody
    public Login loginByAccountNum(
            @RequestParam(value = "accountNumber", required = true) String accountNumber,
            @RequestParam(value = "password", required = true) String password){

        System.out.println("控制层校验登录中....");
        System.out.println(accountNumber+password);
        loginService.login();
        Login login = new Login(accountNumber,password);
        return login;
    }

    @RequestMapping(value = "/qq",method = RequestMethod.POST)
    public String loginByQQ(
            @RequestParam(value = "accountNumber", required = true) String accountNumber,
            @RequestParam(value = "password", required = true) String password){

        return null;
    }

    @RequestMapping(value = "/phone",method = RequestMethod.POST)
    public String loginByPhone(
            @RequestParam(value = "accountNumber", required = true) String accountNumber,
            @RequestParam(value = "password", required = true) String password){

        return null;
    }

    @RequestMapping(value = "/weChat",method = RequestMethod.POST)
    public String loginByWeChat(
            @RequestParam(value = "accountNumber", required = true) String accountNumber,
            @RequestParam(value = "password", required = true) String password){

        return null;
    }

    @RequestMapping(value = "/email",method = RequestMethod.POST)
    public String loginByEmail(
            @RequestParam(value = "accountNumber", required = true) String accountNumber,
            @RequestParam(value = "password", required = true) String password){

        return null;
    }

}
