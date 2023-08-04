package com.pineftn.webspringbootlearning.controller;

import com.pineftn.webspringbootlearning.pojo.User;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

/**
 * 测试请求参数接收
 */
@RestController
public class RequestController {

    // 原始方式（通过HttpServletRequest对象手动获取Request中的Params）
    @RequestMapping("/simpleParamManual")
    public String simpleParamManual(HttpServletRequest request) {
        String name = request.getParameter("name");
        String ageStr = request.getParameter("age");
        int age = Integer.parseInt(ageStr);
        System.out.println(name + ", " + age);
        return "OK";
    }

    @RequestMapping("/simpleParam")
    public String simpleParam(
            // ?name=Duo&age=12
            // 不加注释：参数key和形参变量名相同，即可接收参数
            // 加注释：@RequestParam(name = "参数key") Type 形参,
            @RequestParam String name,
            @RequestParam int age
    ) {
        System.out.println(name + "," + age);
        return "OK";
    }


    //非嵌套：http://localhost:8080/simplePojo?name=simplePojo&age=18
    @RequestMapping("/simplePojo")
    public String simplePojo(User user) {
        System.out.println(user);
        return "OK";
    }

    //嵌套：http://localhost:8080/complexPojo?name=complexPojo&age=18&address.country=UK&address.city=London
    @RequestMapping("/complexPojo")
    public String complexPojo(User user) {
        System.out.println(user);
        return "OK";
    }

    @RequestMapping("/arrayParam")
    public String arrayParam(String[] hobby) {
        System.out.println(Arrays.toString(hobby));
        return "OK";
    }

    @RequestMapping("/listParam")
    public String listParam(@RequestParam List<String> hobby) {
        System.out.println(hobby);
        return "OK";
    }

    //http://localhost:8080/dateParam?updateTime=2023-08-04 16:27:03
    @RequestMapping("/dateParam")
    public String dateParam(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime updateTime) {
        System.out.println(updateTime);
        return "OK";
    }


    @RequestMapping("/jsonParam")
    public String jsonParam(@RequestBody User user) {
        System.out.println(user);
        return "OK";
    }

    //http://localhost:8080/pathParam/users/Pine/profile/7
    @RequestMapping("/pathParam/users/{user}/profile/{id}")
    public String pathParam(
            @PathVariable String user,
            @PathVariable int id
    ) {
        System.out.println(user + ", " + id);
        return "OK";
    }


}

