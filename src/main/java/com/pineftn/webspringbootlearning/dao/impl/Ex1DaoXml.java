package com.pineftn.webspringbootlearning.dao.impl;

import com.pineftn.webspringbootlearning.dao.Ex1Dao;
import com.pineftn.webspringbootlearning.pojo.SimpleUser;
import org.springframework.stereotype.Component;

import java.util.List;

// 标识这个类是
@Component
public class Ex1DaoXml implements Ex1Dao {

    @Override
    public List<SimpleUser> getAllUser() {
        // 获取文件绝对路径 PineQ啥玩意？
        String file = this.getClass().getClassLoader().getResource("all_users.xml").getFile();
        //获取xml数据
        //List<User> userList = XMLParserUtils.parse(file, User.class);
        //return userList;
        return null;
    }
}
