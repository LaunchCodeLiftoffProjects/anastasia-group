package org.launchcode.Health.Application.Controllers;
//

import org.launchcode.Health.Application.data.GoalRepository;
import org.launchcode.Health.Application.models.WeekDays;
import org.launchcode.Health.Application.models.Goal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("goals")
public class GoalsController {
    @Autowired
    private GoalRepository goalRepository;

    @GetMapping()
    public String displayAllGoals(Model model) {
        model.addAttribute ("goals", goalRepository.findAll());
        return "goals/index";
    }


    @GetMapping("create")
    public String renderCreateGoalForm(Model model){
        model.addAttribute("title", "Create a Goal");
        model.addAttribute("goal", new Goal());
        model.addAttribute("weekDays", WeekDays.values());
        return "goals/create";
    }

    @PostMapping("create")
    public String processCreateGoalForm(@ModelAttribute  Goal newGoal)
    {
        goalRepository.save(newGoal);
        return "redirect:";
    }

    @GetMapping("delete")
    public String displayDeleteGoalForm(Model model){
        model.addAttribute("title","Delete a Goal");
        model.addAttribute("goals", goalRepository.findAll());
        return "goals/delete";
    }
    @PostMapping("delete")
    public String processDeleteGoalsForm(@RequestParam(required = false) int[] goalIds) {
        if (goalIds != null) {
            for (int id : goalIds) {
                goalRepository.deleteById(id);
            }
        }
            return "redirect:";
        }



}

