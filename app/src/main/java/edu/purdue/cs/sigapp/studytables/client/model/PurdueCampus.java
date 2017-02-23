package edu.purdue.cs.sigapp.studytables.client.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.UUID;

/**
 * Created by mvieck on 1/20/17.
 */

public class PurdueCampus {
    @SerializedName("CampusId")
    private UUID campusId;
    @SerializedName("Code")
    private String code;
    @SerializedName("Name")
    private String name;
    @SerializedName("ZipCode")
    private String zipCode;
    @SerializedName("Buildings")
    private List<PurdueBuilding> buildings;

    public PurdueCampus() {
    }

    public PurdueCampus(UUID campusId, String code, String name, String zipCode, List<PurdueBuilding> buildings) {
        this.campusId = campusId;
        this.code = code;
        this.name = name;
        this.zipCode = zipCode;
        this.buildings = buildings;
    }

    public UUID getCampusId() {
        return campusId;
    }

    public void setCampusId(UUID campusId) {
        this.campusId = campusId;
    }

    public List<PurdueBuilding> getBuildings() {
        return buildings;
    }

    public void setBuildings(List<PurdueBuilding> buildings) {
        this.buildings = buildings;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
