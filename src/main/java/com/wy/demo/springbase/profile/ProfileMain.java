package com.wy.demo.springbase.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProfileMain {
    public static void main(String[]args){
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("prod");
        context.register(ProfileConfig.class);
        context.refresh();
        DemoBean demoBean=context.getBean(DemoBean.class);
        System.out.println(demoBean.getContent());
        context.close();
    }
}
