package org.launchcode.Health.Application.Controllers;

import org.launchcode.Health.Application.models.homePage.HomePageContact;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping
public class HomePageController {

    @GetMapping("home")
    public String homePage(Model model) {
        model.addAttribute("homePageContact", new HomePageContact());
        return "homePage/homePage";
    }

    @PostMapping("home")
    public String greeting(@ModelAttribute HomePageContact homePageContact, Model model){
        model.addAttribute("homePageContact", homePageContact);
        return "homePage/contact";
    }

}
