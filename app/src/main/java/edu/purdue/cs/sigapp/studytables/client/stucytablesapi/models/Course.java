package edu.purdue.cs.sigapp.studytables.client.stucytablesapi.models;

import java.util.Arrays;
import java.util.List;

/**
 * Created by dmtsc on 4/4/2017.
 */

public class Course {

    public static List<Course> makeRandomClasses() {
        return Arrays.asList(new Course(), new Course());
    }
}
