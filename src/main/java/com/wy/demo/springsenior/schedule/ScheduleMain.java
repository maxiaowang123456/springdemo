package com.wy.demo.springsenior.schedule;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScheduleMain {
    public static void main(String[]args){
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(TaskScheduleConfig.class);
    }
}
