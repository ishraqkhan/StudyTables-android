package edu.purdue.cs.sigapp.studytables.classes.activity;

/**
 * Created by mvieck on 1/11/17.
 */

public class PurdueClass {
    private int number;
    private String title;
    private float credits;
    private String description;

    public PurdueClass() {
    }

    public PurdueClass(int number, String title, float credits, String description) {
        this.number = number;
        this.title = title;
        this.credits = credits;
        this.description = description;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getCredits() {
        return credits;
    }

    public void setCredits(float credits) {
        this.credits = credits;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
