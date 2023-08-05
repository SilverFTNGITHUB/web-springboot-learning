package com.pineftn.webspringbootlearning.service.impl;

import com.pineftn.webspringbootlearning.dao.Ex1Dao;
import com.pineftn.webspringbootlearning.dao.impl.Ex1DaoInCode;
import com.pineftn.webspringbootlearning.pojo.User;
import com.pineftn.webspringbootlearning.service.Ex1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

// 将当前类交给IOC Container (Spring) 管理
// 使其成为IOC Container中的bean
//@Component

//@Component衍生注解
@Service
public class Ex1ServiceA implements Ex1Service {
    // @Autowired 用于实现自动装配，让Spring容器负责查找、创建和注入所需的依赖对象
    // （即不再在代码中手动选择实现类）
    @Autowired
    private Ex1Dao ex1Dao;



    @Override
    public List<User> getAllUser() {
        // 调用Dao获取用户列表
        List<User> userList =ex1Dao.getAllUser();


        return userList;
    }
}
