package com.wy.demo.springmvc.build.serverpush.sse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class SseController {

    //注意：设置response的字符集，否则在页面会出现字符显示错误
    @RequestMapping(value = "/push",produces = "text/event-stream;charset=UTF-8")
    public @ResponseBody String push(){
        Random r=new Random();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "data:Testing 1,2,3"+r.nextInt()+"\n\n";
    }
}
