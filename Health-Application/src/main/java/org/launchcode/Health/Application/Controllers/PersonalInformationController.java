package org.launchcode.Health.Application.Controllers;

import org.launchcode.Health.Application.models.personal.PersonalInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
    @Controller
    public class PersonalInformationController {

        @GetMapping("Personal")
        public String greeting(Model model) {
            model.addAttribute("personalInfo", new PersonalInfo());
            return "personal/personalInformation";
        }


        @PostMapping("Personal")
        public String saveGreeting(@ModelAttribute PersonalInfo personalInfo, Model model) {
            model.addAttribute("personalInfo", personalInfo);
            return "personal/submittedForm";
        }
    }
