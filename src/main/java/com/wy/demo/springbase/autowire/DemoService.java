package com.wy.demo.springbase.autowire;

import org.springframework.stereotype.Service;

@Service
public class DemoService {
    public String sayHello(String word){
        return "hello "+word;
    }
}
