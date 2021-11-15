package com.copift.homeworkreminder.model;

import java.util.ArrayList;

public class Week {


    private ArrayList<Day> days;


    public ArrayList<Day> getDays() {
        return days;
    }

    public void setDays(ArrayList<Day> days) {
        this.days = days;
    }

    public void addDay (Day day){
        if (days == null){
            days = new ArrayList<>();
        }
        days.add(day);
    }

}
