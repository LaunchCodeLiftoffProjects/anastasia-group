package org.launchcode.Health.Application.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
@RequestMapping("goals")
public class GoalsController {
    @Autowired
    private GoalRepository goalRepository;

    @RequestMapping("")
    public String index(Model model) {
        model.addAttribute ("goals", goalRepository.findAll());
        return "goals/index";
    }

    @GetMapping("add")
    public String displayAddGoalsForm(Model model){
        model.addAttribute(new Goal());
        return "goals/add";
    }

    @PostMapping("add")
    public String processAddGoalForm(@ModelAttribute @Valid Skill newSkill, Errors errors, Model model){
        if (errors.hasErrors()){
            return "goals/add";
        }
        model.addAttribute("goal", goalRepository.save(newGoal));
        return "redirect";
    }

    @GetMapping("view/{goalId")
    public String dispalyViewGoal(Model model, @PathVariable int goalId){
        Optional optGoal = goalRepository.findById(goalId);
        if (optGoal.isPresent()){
            Goal goal = (Goal) optGoal.get();
            model.addAttribute("goal", goal);
            return "goals/view";
        } else{
            return "redirect:../";
        }


    }






}
