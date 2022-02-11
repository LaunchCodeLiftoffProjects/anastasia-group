package org.launchcode.Health.Application.Controllers;


import org.launchcode.Health.Application.data.GoalRepository;
import org.launchcode.Health.Application.models.Goal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping()
public class TrackingController {

    @Autowired
    private GoalRepository goalRepository;

    @GetMapping("tracking")
    public String tracking(Model model){
        model.addAttribute("chartData", getChartData());
        return "trackingPage/tracking";

    }

    private List<List<Object>> getChartData() {
        List<List<Object>> goalList = new ArrayList<>();
        List<Goal> goals = (List<Goal>) goalRepository.findAll();

        for (Goal goal: goals) {
            List<Object> newGoal= List.of(goal.getName(), goal.getDays());
            goalList.add(newGoal);
        }

        return goalList;
    }

}
