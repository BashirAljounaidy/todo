package com.aljo.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
    // Say hello => Hello what are you leaning today
    @RequestMapping("say-hello")
    @ResponseBody
    public String sayHello() {
        return "<h1>Hello ! what are you leaning today</h1>";
    }
}
