package org.launchcode.Health.Application.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping()
public class TrackingController {

    @GetMapping("tracking")
    public String tracking(){
        return "trackingPage/tracking";

    }
}
