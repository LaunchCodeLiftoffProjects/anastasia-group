package org.launchcode.Health.Application.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping
public class HomePageController {

    @GetMapping("home")
    public String homePage() {

        return "homePage/homePage";
    }

    //dynamic handler
//    @GetMapping("hello/{name}")
//    public String personalDetails(@PathVariable String name) {


}
