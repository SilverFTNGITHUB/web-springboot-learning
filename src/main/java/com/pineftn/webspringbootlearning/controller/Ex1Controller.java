package com.pineftn.webspringbootlearning.controller;

import com.pineftn.webspringbootlearning.pojo.Result;
import com.pineftn.webspringbootlearning.pojo.User;
import com.pineftn.webspringbootlearning.service.Ex1Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Ex1Controller {
    private Ex1Service ex1Service;

    @RequestMapping()
    public Result showList() {
        //调用Service获取数据
        List<User> userList = ex1Service.getAllUser();
        //组装数据并返回
        return Result.success(userList);
    }

}
