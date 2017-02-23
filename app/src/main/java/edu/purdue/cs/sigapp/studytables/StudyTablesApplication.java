package edu.purdue.cs.sigapp.studytables;

import android.app.Application;

import com.joanzapata.iconify.Iconify;
import com.joanzapata.iconify.fonts.MaterialCommunityModule;
import com.joanzapata.iconify.fonts.MaterialModule;

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

        //This will allow us to reference a bunch of graphics
        // and icons without needing to import all the raw files.
        Iconify
                .with(new MaterialModule())
                .with(new MaterialCommunityModule());
    }
}
