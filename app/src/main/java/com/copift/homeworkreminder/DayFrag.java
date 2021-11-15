package com.copift.homeworkreminder;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.copift.homeworkreminder.model.Day;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DayFrag#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DayFrag extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private ArrayList<LessonFrag> lessonFrags = new ArrayList<>();


    public DayFrag() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment dayFrag.
     */
    // TODO: Rename and change types and number of parameters
    public static DayFrag newInstance(String param1, String param2) {
        DayFrag fragment = new DayFrag();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

      //  View view = inflater.inflate(R.layout.activity_main, container, false);
     //   lessonFrags.clear();




        return inflater.inflate(R.layout.fragment_day, container, false);
    }

    public void setDay(Day day){
        View view = getView();
        DateFormat sdf = new SimpleDateFormat("EEE, d MMM yyyy");


        TextView less  = view.findViewById(R.id.dateLess);
        less.setText( sdf.format(  day.getDate()));

        LessonFrag lfrag = (LessonFrag) getChildFragmentManager().findFragmentById((R.id.less1));
        lfrag.setTextLesson(day.getLessons().get(0));

        LessonFrag lfrag2 = (LessonFrag) getChildFragmentManager().findFragmentById((R.id.less2));
        lfrag2.setTextLesson(day.getLessons().get(1));

        LessonFrag lfrag3 = (LessonFrag) getChildFragmentManager().findFragmentById((R.id.less3));
        lfrag3.setTextLesson(day.getLessons().get(2));

        LessonFrag lfrag4 = (LessonFrag) getChildFragmentManager().findFragmentById((R.id.less4));
        lfrag4.setTextLesson(day.getLessons().get(3));

        LessonFrag lfrag5 = (LessonFrag) getChildFragmentManager().findFragmentById((R.id.less5));
        lfrag5.setTextLesson(day.getLessons().get(4));




    }

}