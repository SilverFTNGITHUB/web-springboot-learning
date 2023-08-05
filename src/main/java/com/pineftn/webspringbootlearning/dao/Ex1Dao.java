package com.pineftn.webspringbootlearning.dao;

import com.pineftn.webspringbootlearning.pojo.User;

import java.util.List;

//使用接口->实现类的结构
//这样如果要改变Data Access方式，只要改变实现类即可，无需改变其他代码
//使得三层架构之间耦合性降低
public interface Ex1Dao {
    //查
//    User getUserById(int id);
    List<User> getAllUser();

    //增删改
//    void saveUser(User user);
//    void updateUser(User user);
//    void deleteUser(int id);

}
