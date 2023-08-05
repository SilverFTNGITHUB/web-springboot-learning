package com.pineftn.webspringbootlearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // 默认扫描当当前包及其子包
public class WebSpringbootLearningApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebSpringbootLearningApplication.class, args);
    }

}
