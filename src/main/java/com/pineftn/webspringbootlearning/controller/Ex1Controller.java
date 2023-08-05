package com.pineftn.webspringbootlearning.controller;

import com.pineftn.webspringbootlearning.pojo.Result;
import com.pineftn.webspringbootlearning.pojo.User;
import com.pineftn.webspringbootlearning.service.Ex1Service;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// @Controller + @ResponseBody
@RestController
public class Ex1Controller {
    // @Autowired 依赖注入
    // 用于实现自动装配，让Spring容器负责查找、创建和注入所需的依赖对象
    // （即不再在代码中手动选择实现类）
    @Autowired
    private Ex1Service ex1Service;


    @RequestMapping("userList")
    public Result userList() {
        //调用Service获取数据
        List<User> userList = ex1Service.getAllUser();
        System.out.println(userList);
        //组装数据并返回
        return Result.success(userList);
    }

}
