package com.wy.demo.springsenior.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AwareMain {

    public static void main(String[]args){
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(AwareConfig.class);
        AwareService service=context.getBean(AwareService.class);
        service.outputResult();
        context.close();
    }

}
