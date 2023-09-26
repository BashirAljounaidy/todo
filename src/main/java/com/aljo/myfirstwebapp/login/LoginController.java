package com.aljo.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.aljo.myfirstwebapp.AuthenticationService;

@Controller
public class LoginController {
    private AuthenticationService authenticationService;
    

    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String gotoLoginPage() {
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String gotoWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {
        if (authenticationService.authenticate(name, password)) {
            model.put("name", name);
            return "welcome";
        } else
            model.put("errorMessage","Invalid Credentials!");
            return "login";

    }
}