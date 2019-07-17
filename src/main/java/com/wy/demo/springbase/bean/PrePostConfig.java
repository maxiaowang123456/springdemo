package com.wy.demo.springbase.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.wy.demo.springbase.bean")
public class PrePostConfig {

    @Bean(initMethod = "init",destroyMethod = "destroy")
    public BeanWayService beanWayService(){
        return new BeanWayService();
    }
    @Bean
    public JSR250WayService jsr250WayService(){
        return  new JSR250WayService();
    }
}
