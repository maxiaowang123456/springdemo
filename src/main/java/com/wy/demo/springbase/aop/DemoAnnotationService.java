package com.wy.demo.springbase.aop;

import org.springframework.stereotype.Service;

@Service
public class DemoAnnotationService {
    @Action(name = "注解拦截add操作")
    public void add(){}
}
