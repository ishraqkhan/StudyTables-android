package edu.purdue.cs.sigapp.studytables.general.models;

import java.util.ArrayList;

/**
 * Created by Ishraq on 1/10/2017.
 */

public class DummieClassList {
    public static ArrayList<String> mClassList = new ArrayList<String>();
    public static ArrayList<String> mTimeList = new ArrayList<String>();
    public static ArrayList<String> repeatList = new ArrayList<String>();
    public static ArrayList<String> reminderList = new ArrayList<String>();

    static{
        //Add default classes to the mClassList
        mClassList.add("CS182");
        mClassList.add("CS240");
        mClassList.add("MA265");
        mClassList.add("SPAN201");
        mClassList.add("PSY120");

        //Add times to List of time lengths
        mTimeList.add("30 minutes");
        mTimeList.add("60 minutes");
        mTimeList.add("90 minutes");
        mTimeList.add("120+ minutes");

        //Add options for how often to repeat meeting
        repeatList.add("None");
        repeatList.add("Every week");
        repeatList.add("Bi-weekly");
        repeatList.add("Other");

        //Add options for how long before to remind students about meeting
        reminderList.add("No reminder");
        reminderList.add("30 minutes before");
        reminderList.add("1 hour before");
        reminderList.add("2 hours before");
    }
}
