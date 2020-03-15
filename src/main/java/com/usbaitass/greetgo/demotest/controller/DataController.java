package com.usbaitass.greetgo.demotest.controller;

import com.usbaitass.greetgo.demotest.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {


    @Autowired
    DataService dataService;

    @GetMapping("/hello")
    public String sayHello(){
        return dataService.findById(1);
    }


}
