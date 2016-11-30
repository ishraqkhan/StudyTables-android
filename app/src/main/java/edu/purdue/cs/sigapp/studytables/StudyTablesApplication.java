package edu.purdue.cs.sigapp.studytables;

import android.app.Application;

import net.danlew.android.joda.JodaTimeAndroid;

/**
 * Custom base application class for the project.
 */

public class StudyTablesApplication extends Application {
    /**
     * This is run before even the first screen shows up
     * and before all other code in the app.
     */
    @Override
    public void onCreate() {
        super.onCreate();

        //The Jodetime library requires this init step to function.
        JodaTimeAndroid.init(this);
    }
}
