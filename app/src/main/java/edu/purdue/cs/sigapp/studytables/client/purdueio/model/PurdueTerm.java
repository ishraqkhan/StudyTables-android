package edu.purdue.cs.sigapp.studytables.client.purdueio.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by mvieck on 1/17/17.
 */

public class PurdueTerm {
    @SerializedName("TermId")
    String termId;
    @SerializedName("TermCode")
    String termCode;
    @SerializedName("Name")
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
