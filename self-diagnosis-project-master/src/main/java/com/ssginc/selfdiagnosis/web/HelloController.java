package com.ssginc.selfdiagnosis.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/")
    public String hello(){
        return "hello, self-diagnosis project!";
    }

}
