package org.launchcode.Health.Application.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "registration")
public class RegistrationController {
    @RequestMapping()
    public  String login(){
        return "registration";
    }
}
