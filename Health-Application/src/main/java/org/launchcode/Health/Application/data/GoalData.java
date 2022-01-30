package org.launchcode.Health.Application.data;

import org.launchcode.Health.Application.models.Goal;

import java.util.*;

public class GoalData {
    //need a place to put goals
    private static final Map<Integer, Goal> goals = new HashMap<>();

    // get all goals
    public static Collection<Goal> getAll(){
        return goals.values();
    }

    //get a single goal
    public static Goal getById(Integer id) {
        return goals.get(id);
    }

    public static void remove(Integer id) {
        if (goals.containsKey(id)) {
            goals.remove(id);
        }
    }

    // add a goal

    public static void add(Goal goal){
        goals.put(goal.getId(), goal);
    }

    // remove a goal

    public static void remove (int id){
        goals.remove (id);
    }




}
