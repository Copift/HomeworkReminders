package com.copift.homeworkreminder.model;

import java.util.ArrayList;
import java.util.Date;

public class Day {
    private ArrayList<Lesson> lessons = null;
    private Date date;

    public Day(Date date) {
        this.date = date;

    }

    public ArrayList<Lesson> getLessons() {
        return lessons;
    }
public void addLesson(Lesson less){
       if (lessons == null) {
           lessons = new ArrayList<>();
       }
       lessons.add(less);

}
    public void setLessons(ArrayList<Lesson> lessons) {
        this.lessons = lessons;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
