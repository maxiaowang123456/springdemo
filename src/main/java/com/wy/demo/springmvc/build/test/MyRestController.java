package com.wy.demo.springmvc.build.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
    @Autowired
    DemoServiceTest demoServiceTest;

    @RequestMapping(value = "/testRest",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String testRest(){
        return demoServiceTest.saySomething();
    }
}
