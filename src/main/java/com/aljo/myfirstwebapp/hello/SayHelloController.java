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
    @RequestMapping("say-hello-html")
    @ResponseBody
    public String sayHelloHtml() {
        StringBuffer sb= new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>Hello ! HTML</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("<h1>Hello ! HTML</h1>");
        sb.append("</body>");
        sb.append("</html>");
        return sb.toString();
    }
}
