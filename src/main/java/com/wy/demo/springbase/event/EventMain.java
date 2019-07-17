package com.wy.demo.springbase.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EventMain {

    public static void main(String[]args){
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher publisher=context.getBean(DemoPublisher.class);
        publisher.publish("hello application event");
        context.close();
    }
}
