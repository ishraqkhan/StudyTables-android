package edu.purdue.cs.sigapp.studytables;

import edu.purdue.cs.sigapp.studytables.client.stucytablesapi.models.Event;

/**
 * Created by dmtsc on 4/6/2017.
 */

public interface OnEventClickedListener {
    void onEventClicked(Event event);
}
