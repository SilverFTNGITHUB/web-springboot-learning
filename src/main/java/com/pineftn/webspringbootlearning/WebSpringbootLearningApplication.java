package com.pineftn.webspringbootlearning;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // 默认扫描当当前包及其子包
@MapperScan("com.pineftn.webspringbootlearning.mapper")//让MyBatis为@Mapper接口生成实现类
public class WebSpringbootLearningApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebSpringbootLearningApplication.class, args);
    }

}
