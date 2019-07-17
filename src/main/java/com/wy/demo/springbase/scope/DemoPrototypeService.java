package com.wy.demo.springbase.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(value = "prototype")
public class DemoPrototypeService {
}
