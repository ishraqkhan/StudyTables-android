package edu.purdue.cs.sigapp.studytables.classes.activity;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.UUID;

/**
 * Created by mvieck on 1/20/17.
 */

public class PurdueInstructor {
    @SerializedName("InstructorId")
    private UUID instructorId;
    @SerializedName("Name")
    private String name;
    @SerializedName("Email")
    private String email;
    @SerializedName("Meeting")
    private List<PurdueMeeting> meetings;

    public PurdueInstructor() {
    }

    public PurdueInstructor(String email, UUID instructorId, List<PurdueMeeting> meetings, String name) {
        this.email = email;
        this.instructorId = instructorId;
        this.meetings = meetings;
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UUID getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(UUID instructorId) {
        this.instructorId = instructorId;
    }

    public List<PurdueMeeting> getMeetings() {
        return meetings;
    }

    public void setMeetings(List<PurdueMeeting> meetings) {
        this.meetings = meetings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
