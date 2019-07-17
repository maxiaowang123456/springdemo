package com.wy.demo.springmvc.build.converter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ConverterController {

    @RequestMapping(value = "/convert",produces = "application/x-wy")
    public @ResponseBody DemoObj convert(@RequestBody DemoObj obj){
        return obj;
    }
}
