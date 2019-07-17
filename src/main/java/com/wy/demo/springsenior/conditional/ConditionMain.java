package com.wy.demo.springsenior.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConditionMain {
    public static void main(String[]args){
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(ConditionConfig.class);
        ListService service= context.getBean(ListService.class);
        String os=context.getEnvironment().getProperty("os.name").toLowerCase();
        System.out.println("当前系统名称是："+os);
        System.out.println(os+
            "系统下的命令是："+service.showListCmd());
    }
}
