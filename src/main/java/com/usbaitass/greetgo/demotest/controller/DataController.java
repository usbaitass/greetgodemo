package com.usbaitass.greetgo.demotest.controller;

import com.usbaitass.greetgo.demotest.mapper.DataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {


    @Autowired
    DataMapper dataMapper;

    @GetMapping("/hello")
    public String sayHello(){
        return dataMapper.findById(1).getValue();
    }


}
