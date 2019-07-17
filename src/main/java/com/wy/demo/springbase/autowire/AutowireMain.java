package com.wy.demo.springbase.autowire;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutowireMain {
    public static void main(String[]args){
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(DemoConfig.class);
        FuntionService service=context.getBean(FuntionService.class);
        System.out.println(service.sayHello("wy"));
        context.close();
    }
}
