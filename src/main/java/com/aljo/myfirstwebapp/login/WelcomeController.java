package com.aljo.myfirstwebapp.login;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import java.time.LocalDate;

@Controller
@SessionAttributes("name")
public class WelcomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String gotoWelcomePage(ModelMap model) {
        model.put("name", getLoggedinUserName());
        model.put("date", LocalDate.now());
        return "welcome";
    }

    private String getLoggedinUserName() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return authentication.getName();
    }
}
