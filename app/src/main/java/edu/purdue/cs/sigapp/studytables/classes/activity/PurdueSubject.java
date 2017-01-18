package edu.purdue.cs.sigapp.studytables.classes.activity;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by mvieck on 1/17/17.
 */

public class PurdueSubject {
    UUID subjectId;
    String name;
    String abbreviation;
    ArrayList<PurdueCourse> courses;

    public PurdueSubject() {
    }

    public PurdueSubject(UUID subjectId, String name, String abbreviation, ArrayList<PurdueCourse> courses) {
        this.subjectId = subjectId;
        this.name = name;
        this.abbreviation = abbreviation;
        this.courses = courses;
    }

    public UUID getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(UUID subjectId) {
        this.subjectId = subjectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public ArrayList<PurdueCourse> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<PurdueCourse> courses) {
        this.courses = courses;
    }
}
