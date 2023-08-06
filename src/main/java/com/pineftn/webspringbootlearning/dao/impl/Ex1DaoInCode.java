package com.pineftn.webspringbootlearning.dao.impl;

import com.pineftn.webspringbootlearning.dao.Ex1Dao;
import com.pineftn.webspringbootlearning.pojo.Address;
import com.pineftn.webspringbootlearning.pojo.SimpleUser;
import org.springframework.context.annotation.Primary;
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
    public List<SimpleUser> getAllUser() {
        SimpleUser simpleUser1 = new SimpleUser(1, "Cath", 12, new Address("UK", "London"));
        SimpleUser simpleUser2 = new SimpleUser(2, "Dogge", 17, new Address("US", "California"));
        List<SimpleUser> simpleUserList = new ArrayList<>();
        simpleUserList.add(simpleUser1);
        simpleUserList.add(simpleUser2);
        return simpleUserList;
    }
}
