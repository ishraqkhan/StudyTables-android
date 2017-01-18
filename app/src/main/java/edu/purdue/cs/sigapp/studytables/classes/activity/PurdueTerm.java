package edu.purdue.cs.sigapp.studytables.classes.activity;

import java.util.ArrayList;

/**
 * Created by mvieck on 1/17/17.
 */

public class PurdueTerm {
    String termId;
    String termCode;
    String name;
    ArrayList<PurdueClass> classes;

    public PurdueTerm() {
    }

    public PurdueTerm(ArrayList<PurdueClass> classes, String termId, String termCode, String name) {
        this.classes = classes;
        this.termId = termId;
        this.termCode = termCode;
        this.name = name;
    }

    public String getTermId() {
        return termId;
    }

    public void setTermId(String termId) {
        this.termId = termId;
    }

    public ArrayList<PurdueClass> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<PurdueClass> classes) {
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTermCode() {
        return termCode;
    }

    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }
}
