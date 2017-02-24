package edu.purdue.cs.sigapp.studytables.general;

/**
 * Created by Ishraq on 1/10/2017.
 */

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.util.Log;
import android.widget.DatePicker;
import android.widget.TimePicker;


import org.joda.time.LocalDate;
import org.joda.time.LocalTime;

import java.util.Calendar;

import edu.purdue.cs.sigapp.studytables.R;

public class TimePickerFragment extends DialogFragment implements TimePickerDialog.OnTimeSetListener {

    private OnTimeSetListener timeLister;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the current date as the default date in the picker
        final Calendar c = Calendar.getInstance();
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);

        // Create a new instance of DatePickerDialog and return it
        return new TimePickerDialog(getActivity(), this, hour, minute, false);
    }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        Log.d("Timepicker", "Hello World, " + hourOfDay + ": " + minute);
        LocalTime localTime = new LocalTime(hourOfDay, minute);
        timeLister.onTimeSet(localTime);
    }

    public void setTimeLister(OnTimeSetListener timeLister) {
        this.timeLister = timeLister;
    }
}