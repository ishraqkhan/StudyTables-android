package edu.purdue.cs.sigapp.studytables.scheduling.model;

import org.joda.time.Interval;

/**
 * Represents a single chunk of availability in the scheduling of an event.
 * For example, this class could represent the following:
 *
 * "I am available from 1:00pm - 5:00pm EST on Thursday October 5th"
 */

public class AvailabilitySegment {
    //See: http://www.joda.org/joda-time/apidocs/org/joda/time/Interval.html
    public Interval availableInterval;

}
