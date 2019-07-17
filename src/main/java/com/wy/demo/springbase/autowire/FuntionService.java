package com.wy.demo.springbase.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuntionService {

    @Autowired
    private DemoService demoService;

    public String sayHello(String word){
        return demoService.sayHello(word);
    }
}
