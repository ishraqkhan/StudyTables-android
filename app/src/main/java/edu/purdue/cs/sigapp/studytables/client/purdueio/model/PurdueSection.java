package edu.purdue.cs.sigapp.studytables.client.purdueio.model;

import java.util.UUID;

/**
 * Created by mvieck on 1/17/17.
 */

public class PurdueSection {
    UUID sectionId;
    String crn;
    String type;
    String registrationString;
    int capacity;
    int enrolled;
    int remainingSpace;
    int waitlistCapacity;
    int waitlistCount;
    int waitlistSpace;
    PurdueClass purdueClass;

    public PurdueSection() {
    }

    public PurdueSection(UUID sectionId, String crn, String type, String registrationString, int capacity, int enrolled, int remainingSpace, int waitlistCapacity, int waitlistCount, int waitlistSpace, PurdueClass purdueClass) {
        this.sectionId = sectionId;
        this.crn = crn;
        this.type = type;
        this.registrationString = registrationString;
        this.capacity = capacity;
        this.enrolled = enrolled;
        this.remainingSpace = remainingSpace;
        this.waitlistCapacity = waitlistCapacity;
        this.waitlistCount = waitlistCount;
        this.waitlistSpace = waitlistSpace;
        this.purdueClass = purdueClass;
    }

    public UUID getSectionId() {
        return sectionId;
    }

    public void setSectionId(UUID sectionId) {
        this.sectionId = sectionId;
    }

    public String getCrn() {
        return crn;
    }

    public void setCrn(String crn) {
        this.crn = crn;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRegistrationString() {
        return registrationString;
    }

    public void setRegistrationString(String registrationString) {
        this.registrationString = registrationString;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getEnrolled() {
        return enrolled;
    }

    public void setEnrolled(int enrolled) {
        this.enrolled = enrolled;
    }

    public int getRemainingSpace() {
        return remainingSpace;
    }

    public void setRemainingSpace(int remainingSpace) {
        this.remainingSpace = remainingSpace;
    }

    public int getWaitlistCapacity() {
        return waitlistCapacity;
    }

    public void setWaitlistCapacity(int waitlistCapacity) {
        this.waitlistCapacity = waitlistCapacity;
    }

    public int getWaitlistCount() {
        return waitlistCount;
    }

    public void setWaitlistCount(int waitlistCount) {
        this.waitlistCount = waitlistCount;
    }

    public int getWaitlistSpace() {
        return waitlistSpace;
    }

    public void setWaitlistSpace(int waitlistSpace) {
        this.waitlistSpace = waitlistSpace;
    }

    public PurdueClass getPurdueClass() {
        return purdueClass;
    }

    public void setPurdueClass(PurdueClass purdueClass) {
        this.purdueClass = purdueClass;
    }
}
