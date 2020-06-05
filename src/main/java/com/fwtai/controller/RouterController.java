package com.fwtai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * 路由页面跳转
 * @作者 田应平
 * @版本 v1.0
 * @创建时间 2020-05-04 11:23
 * @QQ号码 444141300
 * @Email service@dwlai.com
 * @官网 http://www.fwtai.com
*/
@Controller
public class RouterController{

    @Autowired
    private HttpServletRequest request;

    // http://www.sso.com:501/index
    // http://www.sso.com:501/index?language=zh_CN
    // http://www.sso.com:501/index?language=en_US
    @GetMapping(value = {"/","/index"})
    public String index(){
        return "index";
    }
}