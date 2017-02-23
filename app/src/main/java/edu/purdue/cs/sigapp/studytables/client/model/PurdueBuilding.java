package edu.purdue.cs.sigapp.studytables.client.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.UUID;

/**
 * Created by mvieck on 1/20/17.
 */
public class PurdueBuilding {
    @SerializedName("BuildingId")
    private UUID buildingId;
    @SerializedName("Name")
    private String name;
    @SerializedName("ShortCode")
    private String shortCode;
    @SerializedName("Campus")
    private PurdueCampus campus;
    @SerializedName("Rooms")
    private List<PurdueRoom> rooms;

    public PurdueBuilding() {
    }

    public PurdueBuilding(UUID buildingId, String name, String shortCode, PurdueCampus campus, List<PurdueRoom> rooms) {
        this.buildingId = buildingId;
        this.name = name;
        this.shortCode = shortCode;
        this.campus = campus;
        this.rooms = rooms;
    }

    public UUID getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(UUID buildingId) {
        this.buildingId = buildingId;
    }

    public PurdueCampus getCampus() {
        return campus;
    }

    public void setCampus(PurdueCampus campus) {
        this.campus = campus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PurdueRoom> getRooms() {
        return rooms;
    }

    public void setRooms(List<PurdueRoom> rooms) {
        this.rooms = rooms;
    }

    public String getShortCode() {
        return shortCode;
    }

    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }
}
