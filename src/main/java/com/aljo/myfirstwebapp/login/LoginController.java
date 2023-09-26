package com.aljo.myfirstwebapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private Logger logger = LoggerFactory.getLogger(getClass());
    // http//:localhost:8080/login?name=Ranga
    //Model
    @RequestMapping("login")
    public String gotoLoginPage(@RequestParam String name, ModelMap model ) {
        model.put("name", name);
        logger.info("Name is " + name);
        return "login";
    }

}
