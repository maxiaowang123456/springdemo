package com.wy.demo.springmvc.build.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NormalController {

    @Autowired
    private DemoServiceTest demoServiceTest;

    @RequestMapping("/normal")
    public String testPage(Model model){
        model.addAttribute("msg", demoServiceTest.saySomething());
        return "page";
    }

}
