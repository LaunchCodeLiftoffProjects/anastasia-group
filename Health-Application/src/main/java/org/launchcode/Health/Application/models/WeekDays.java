package org.launchcode.Health.Application.models;

public enum WeekDays
{
    One_day ("1"), Two_days ("2"), Three_days ("3"), Four_days ("4"), Five_days("5"), Six_days("6"), Seven_days("7");

    private final String displayName;
    WeekDays(String displayName){
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
