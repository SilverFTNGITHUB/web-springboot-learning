package com.pineftn.webspringbootlearning.controller;

import com.pineftn.webspringbootlearning.pojo.Address;
import com.pineftn.webspringbootlearning.pojo.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ResponseController {

    @RequestMapping("/hello")
    public Result hello(){
        System.out.println("Hello World!");
        return Result.success("Hello World!");
    }


    @RequestMapping("/getAddr")
    public Result getAddr(){
        Address address = new Address();
        address.setCountry("UK");
        address.setCity("southampton");
        return Result.success(address);
    }

    @RequestMapping("/listAddr")
    public Result listAddress(){
        List<Address> listAddr = new ArrayList<>();

        Address address1 = new Address();
        address1.setCountry("UK");
        address1.setCity("southampton");

        Address address2 = new Address();
        address2.setCountry("US");
        address2.setCity("New York");

        listAddr.add(address1);
        listAddr.add(address2);

        return Result.success(listAddr);

    }






}
