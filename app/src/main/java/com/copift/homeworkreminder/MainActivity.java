package com.copift.homeworkreminder;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

//import android.fragment.app.Fragment;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;


import com.copift.homeworkreminder.model.Week;
import com.copift.homeworkreminder.util.DBinit;

public class MainActivity extends AppCompatActivity {
   private int countWeek = 0;
    private DBinit dBinit= new DBinit();
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
       Toolbar toolbar = findViewById(R.id.toolbar);
  setSupportActionBar(toolbar);

        // ListView ListLeson1 = findViewById(R.id.ListLesson1);
        //ArrayAdapter<Button> adapter = new ArrayAdapter<>(this,
        //        android.R.layout.simple_list_item_1
        //       , editTexts);

        //ListLeson1.setAdapter(adapter);


        Week week = dBinit.getWeek(0);
setWeek(week);

    }


    private void setWeek(Week week) {
        DayFrag lfrag = (DayFrag) getSupportFragmentManager().findFragmentById((R.id.det_lessonFrag1));
        lfrag.setDay(week.getDays().get(0));

        DayFrag lfrag1 = (DayFrag) getSupportFragmentManager().findFragmentById((R.id.det_lessonFrag2));
        lfrag1.setDay(week.getDays().get(1));

        DayFrag lfrag2 = (DayFrag) getSupportFragmentManager().findFragmentById((R.id.det_lessonFrag3));
        lfrag2.setDay(week.getDays().get(2));

        DayFrag lfrag3 = (DayFrag) getSupportFragmentManager().findFragmentById((R.id.det_lessonFra4));
        lfrag3.setDay(week.getDays().get(3));

        DayFrag lfrag4 = (DayFrag) getSupportFragmentManager().findFragmentById((R.id.det_lessonFrag5));
        lfrag4.setDay(week.getDays().get(4));

        DayFrag lfrag5 = (DayFrag) getSupportFragmentManager().findFragmentById((R.id.det_lessonFrag6));
        lfrag5.setDay(week.getDays().get(5));
    }
        public void onClickNextWeek (View view){
countWeek++;
            setWeek( dBinit.getWeek(countWeek));

        }
    public void onClickBackWeek (View view){
        countWeek--;
        setWeek( dBinit.getWeek(countWeek));

    }
        /*
            int id = getResources().getIdentifier(name, "id", context.getPackageName());
            View view;
            if (id != 0) {
                view = findViewById(id);
            }
        }
*/



}