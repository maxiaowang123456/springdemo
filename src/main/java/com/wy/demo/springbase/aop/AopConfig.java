package com.wy.demo.springbase.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.wy.demo.springbase.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
