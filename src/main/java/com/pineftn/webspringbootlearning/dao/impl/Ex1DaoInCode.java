package com.pineftn.webspringbootlearning.dao.impl;

import com.pineftn.webspringbootlearning.dao.Ex1Dao;
import com.pineftn.webspringbootlearning.pojo.Address;
import com.pineftn.webspringbootlearning.pojo.User;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

// 将当前类交给IOC Container (Spring) 管理
// 使其成为IOC Container中的bean
//@Component

//@Component衍生注解
@Repository
@Primary // 将当前实现类指定为这个接口的首选bean
public class Ex1DaoInCode implements Ex1Dao {
    @Override
    public List<User> getAllUser() {
        User user1 = new User(1, "Cath", 12, new Address("UK", "London"));
        User user2 = new User(2, "Dogge", 17, new Address("US", "California"));
        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        return userList;
    }
}
