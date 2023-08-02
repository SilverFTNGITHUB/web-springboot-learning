package com.pineftn.webspringbootlearning.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试请求参数接收
 */
@RestController
public class RequestController {

    // 原始方式（通过HttpServletRequest对象手动获取Request中的Params）
    @RequestMapping("/simpleParamManual")
    public String simpleParamManual(HttpServletRequest request) {
        String name = request.getParameter("name");
        String ageStr = request.getParameter("age");
        int age = Integer.parseInt(ageStr);
        System.out.println(name + ", " + age);
        return "OK";
    }

    @RequestMapping("/simpleParam")
    public String simpleParam(
            // 参数key和形参变量名相同，即可接收参数
            // ?name=Duo&age=12
            @RequestParam String name,
            @RequestParam int age
    ) {
        System.out.println(name + "," + age);
        return "OK";
    }

}

