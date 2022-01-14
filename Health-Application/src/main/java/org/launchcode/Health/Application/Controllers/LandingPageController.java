package org.launchcode.Health.Application.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "index")
public class LandingPageController {

    public class RegistrationController {

        @RequestMapping()
        public String index() {
            return  "index";
        }
    }
}
