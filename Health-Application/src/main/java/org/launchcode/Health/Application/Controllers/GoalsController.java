package org.launchcode.Health.Application.Controllers;
//

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("goals")
public class GoalsController {
    public static List<String> goals = new ArrayList<>();
    @GetMapping()
    public String displayAllGoals(Model model) {
        model.addAttribute ("goals", goals);
        return "goals/index";
    }

    @GetMapping("create")
    public String renderCreateGoalForm(){
        return "goals/create";
    }

    @PostMapping("create")
    public String createGoal(@RequestParam String goalName){
        goals.add(goalName);
        return "redirect:";
    }

}

