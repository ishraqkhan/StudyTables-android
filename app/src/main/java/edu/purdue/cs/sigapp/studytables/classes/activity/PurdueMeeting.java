package edu.purdue.cs.sigapp.studytables.classes.activity;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.UUID;

/**
 * Created by mvieck on 1/20/17.
 */

public class PurdueMeeting {
    @SerializedName("MeetingId")
    private UUID meetingId;
    @SerializedName("Type")
    private String type;
    @SerializedName("DaysOfWeek")
    private String daysOfWeek;
    @SerializedName("Section")
    private PurdueSection section;
    @SerializedName("Instructors")
    private List<PurdueInstructor> instructors;
    @SerializedName("Room")
    private PurdueRoom room;

    public PurdueMeeting() {
    }

    public PurdueMeeting(String daysOfWeek, List<PurdueInstructor> instructors, UUID meetingId, PurdueRoom room, PurdueSection section, String type) {
        this.daysOfWeek = daysOfWeek;
        this.instructors = instructors;
        this.meetingId = meetingId;
        this.room = room;
        this.section = section;
        this.type = type;
    }

    public String getDaysOfWeek() {
        return daysOfWeek;
    }

    public void setDaysOfWeek(String daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }

    public List<PurdueInstructor> getInstructors() {
        return instructors;
    }

    public void setInstructors(List<PurdueInstructor> instructors) {
        this.instructors = instructors;
    }

    public UUID getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(UUID meetingId) {
        this.meetingId = meetingId;
    }

    public PurdueRoom getRoom() {
        return room;
    }

    public void setRoom(PurdueRoom room) {
        this.room = room;
    }

    public PurdueSection getSection() {
        return section;
    }

    public void setSection(PurdueSection section) {
        this.section = section;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
