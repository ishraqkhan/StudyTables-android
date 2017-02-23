package edu.purdue.cs.sigapp.studytables.client.purdueio.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.UUID;

/**
 * Created by mvieck on 1/20/17.
 */

public class PurdueRoom {
    @SerializedName("RoomId")
    private UUID roomId;
    @SerializedName("Number")
    private String number;
    @SerializedName("Building")
    private PurdueBuilding building;
    @SerializedName("Meetings")
    private List<PurdueMeeting> meetings;

    public PurdueRoom() {
    }

    public PurdueRoom(PurdueBuilding building, UUID roomId, String number, List<PurdueMeeting> meetings) {
        this.building = building;
        this.roomId = roomId;
        this.number = number;
        this.meetings = meetings;
    }

    public UUID getRoomId() {
        return roomId;
    }

    public void setRoomId(UUID roomId) {
        this.roomId = roomId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public PurdueBuilding getBuilding() {
        return building;
    }

    public void setBuilding(PurdueBuilding building) {
        this.building = building;
    }

    public List<PurdueMeeting> getMeetings() {
        return meetings;
    }

    public void setMeetings(List<PurdueMeeting> meetings) {
        this.meetings = meetings;
    }
}
