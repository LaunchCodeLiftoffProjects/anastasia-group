package org.launchcode.Health.Application.Controllers;
//

import org.launchcode.Health.Application.data.GoalData;
import org.launchcode.Health.Application.models.Goal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("goals")
public class GoalsController {

    @GetMapping()
    public String displayAllGoals(Model model) {
        model.addAttribute ("goals", GoalData.getAll());
        return "goals/index";
    }

    @GetMapping("create")
    public String renderCreateGoalForm(){
        return "goals/create";
    }

    @PostMapping("create")
    public String createGoal(@ModelAttribute Goal newGoal)
    {
        GoalData.add(newGoal);
        return "redirect:";
    }

    @GetMapping("delete")
    public String displayDeleteGoalForm(Model model){
        model.addAttribute("title","Delete Goals");
        model.addAttribute("goals", GoalData.getAll());
        return "goals/delete";
    }
    @PostMapping("delete")
    public String processDeleteGoalsForm(@RequestParam(required = false) int[] goalIds) {
        if (goalIds != null) {
            for (int id : goalIds) {
                GoalData.remove(id);
            }
        }
            return "redirect:";
        }


}

