package edu.purdue.cs.sigapp.studytables.client.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by mvieck on 1/17/17.
 */

public class PurdueCourse {
    @SerializedName("CourseId")
    UUID courseId;
    @SerializedName("Number")
    String number;
    @SerializedName("Title")
    String title;
    @SerializedName("CreditHours")
    double creditHours;
    @SerializedName("Description")
    String description;
    @SerializedName("Subject")
    PurdueSubject purdueSubject;
    @SerializedName("Classes")
    ArrayList<PurdueClass> classes;

    public PurdueCourse() {
    }

    public PurdueCourse(ArrayList<PurdueClass> classes, UUID courseId, String number, String title, double creditHours, String description, PurdueSubject purdueSubject) {
        this.classes = classes;
        this.courseId = courseId;
        this.number = number;
        this.title = title;
        this.creditHours = creditHours;
        this.description = description;
        this.purdueSubject = purdueSubject;
    }

    public UUID getCourseId() {
        return courseId;
    }

    public void setCourseId(UUID courseId) {
        this.courseId = courseId;
    }

    public ArrayList<PurdueClass> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<PurdueClass> classes) {
        this.classes = classes;
    }

    public double getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(double creditHours) {
        this.creditHours = creditHours;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public PurdueSubject getPurdueSubject() {
        return purdueSubject;
    }

    public void setPurdueSubject(PurdueSubject purdueSubject) {
        this.purdueSubject = purdueSubject;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
