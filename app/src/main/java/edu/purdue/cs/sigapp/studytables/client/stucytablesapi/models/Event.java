package edu.purdue.cs.sigapp.studytables.client.stucytablesapi.models;

import android.location.Location;

import org.joda.time.LocalDate;
import org.joda.time.LocalTime;

/**
 * Created by dmtsc on 2/23/2017.
 */

public class Event {
    String title;
    String location; //consider making this use GPS, optionally.
    LocalTime time;
    LocalDate date;

    //Need a way to model recurring events.
    boolean isWeekly = false, isDaily = false, isMonthly = false;
}
