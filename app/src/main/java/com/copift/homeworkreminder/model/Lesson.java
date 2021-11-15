package com.copift.homeworkreminder.model;

public class Lesson {
    private String name;
    private String homework;












    public Lesson(String name, String homework) {
        this.name = name;
        this.homework = homework;
    }

    public String getName() {
        if (name.isEmpty()) {
            return "+";
        }
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHomework() {
        return homework;
    }

    public void setHomework(String homework) {
        this.homework = homework;
    }

    public String toString(){
        if (name.isEmpty()) {
            return "+";
        }
        return name+ " "+homework;
    }
}
