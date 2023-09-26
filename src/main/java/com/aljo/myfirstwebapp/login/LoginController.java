package com.aljo.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    // http//:localhost:8080/login?name=Ranga
    //Model
    @RequestMapping("login")
    public String gotoLoginPage() {
        return "login";
    }

}
