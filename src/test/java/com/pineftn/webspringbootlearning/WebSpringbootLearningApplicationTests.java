package com.pineftn.webspringbootlearning;

import com.pineftn.webspringbootlearning.mapper.UserMapper;
import com.pineftn.webspringbootlearning.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest // Springboot整合单元测试的注解
class WebSpringbootLearningApplicationTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testListUser() {
        List<User> userList = userMapper.list();
        userList.stream().forEach(user -> {
            System.out.println(user);
        });
    }
}
