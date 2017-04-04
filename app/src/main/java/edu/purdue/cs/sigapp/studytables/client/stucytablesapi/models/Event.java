package edu.purdue.cs.sigapp.studytables.client.stucytablesapi.models;

import android.location.Location;

import org.joda.time.LocalDate;
import org.joda.time.LocalTime;

import java.util.Arrays;
import java.util.List;

/**
 * Created by dmtsc on 2/23/2017.
 */

public class Event {
    String courseId;
    String name;

    EventSchedule schedule;

    public Event(String courseId, String name, EventSchedule schedule) {
        this.courseId = courseId;
        this.name = name;
        this.schedule = schedule;
    }

    public static List<Event> makeRandomEvents() {
        return Arrays.asList(new Event("123415", "Study Session", null), new Event("86754", "Exam Prep", null));
    }
}
