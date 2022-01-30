package org.launchcode.Health.Application.models;

public enum WeekDays {
    MON("Monday"), TUE("Tuesday"), WED("Wednesday"), THUR("Thursday"), FRI("Friday"), SAT("Saturday"), SUN("Sunday");

    private final String displayName;
    WeekDays(String displayName){
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
