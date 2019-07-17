package com.wy.demo.springbase.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopMain {
    public static void main(String[]args){
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(AopConfig.class);
        DemoAnnotationService service=context.getBean(DemoAnnotationService.class);
        DemoMethodService methodService=context.getBean(DemoMethodService.class);
        service.add();
        methodService.add();
        context.close();
    }
}
