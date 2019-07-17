package com.wy.demo.springbase.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JSR250WayService {
    @PostConstruct
    public void init(){
        System.out.println("jsr250 init-method");
    }

    public JSR250WayService(){
        super();
        System.out.println("jsr250构造函数");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("jsr250 destroy-method");
    }
}
