package com.copift.homeworkreminder.util;

import com.copift.homeworkreminder.model.Day;
import com.copift.homeworkreminder.model.Lesson;
import com.copift.homeworkreminder.model.Week;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

public class DBinit {
   String[] nnameLessons = {"Математика","Физика","русский",""};


   public Week getWeek(int numWeek){
       Week week = new Week();
       Calendar calendar = GregorianCalendar.getInstance();

       int numNextDay = calendar.get(Calendar.DAY_OF_WEEK);


       calendar.add(Calendar.DAY_OF_WEEK, 2 -numNextDay+7*numWeek);
       //System.out.println("Begin " + calendar.getTime());
       Date currDate = calendar.getTime();

       for (int i = 0; i <6 ; i++) {
           Day day = new Day(currDate);
           week.addDay(day);
           for (int j = 0; j <8 ; j++) {
               Random rnd = new Random();

               Lesson lesson = new Lesson(nnameLessons[rnd.nextInt(nnameLessons.length)],"");
               day.addLesson(lesson);
           }

           System.out.println(currDate);
           calendar.add(Calendar.DAY_OF_MONTH, 1);
           currDate = calendar.getTime();//
       }


       return week;
   }


}
