package edu.purdue.cs.sigapp.studytables.general;

import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;

import org.joda.time.LocalTime;

import edu.purdue.cs.sigapp.studytables.R;
import edu.purdue.cs.sigapp.studytables.general.models.DummieClassList;

public class NewEventActivity extends AppCompatActivity implements View.OnClickListener, OnTimeSetListener {
    private Button mCreateButton, mCancelButton;
    private TextView timeTextView, titleTextView, locationTextView;
    private Spinner classListSpinner,timeListSpinner, repeatListSpinner, reminderSpinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_event);

        classListSpinner = (Spinner)findViewById(R.id.classListSpinner);
        ArrayAdapter<String> classListAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, DummieClassList.mClassList);
        classListSpinner.setAdapter(classListAdapter);

        timeListSpinner = (Spinner)findViewById(R.id.timeListSpinner);
        ArrayAdapter<String> timeListAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, DummieClassList.mTimeList);
        timeListSpinner.setAdapter(timeListAdapter);

        repeatListSpinner = (Spinner) findViewById(R.id.repeatListSpinner);
        ArrayAdapter<String> repeatListAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item, DummieClassList.repeatList);
        repeatListSpinner.setAdapter(repeatListAdapter);

        reminderSpinner = (Spinner)findViewById(R.id.reminderSpinner);
        ArrayAdapter<String> reminderAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item, DummieClassList.reminderList);
        reminderSpinner.setAdapter(reminderAdapter);

        timeTextView = (TextView) findViewById(R.id.timeTextView);
        timeTextView.setOnClickListener(this);

        titleTextView = (TextView) findViewById(R.id.activity_new_event_title);

        locationTextView = (TextView) findViewById(R.id.locationEditText);

        mCreateButton = (Button) findViewById(R.id.createButton);
        mCreateButton.setOnClickListener(this);

        mCancelButton = (Button) findViewById(R.id.cancelButton);
        mCancelButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.timeTextView){
            TimePickerFragment newFragment = new TimePickerFragment();
            newFragment.setTimeLister(this);
            newFragment.show(getSupportFragmentManager(), "timePicker");

        }
        else if (v.getId() == R.id.createButton){
            Intent data = new Intent();

            NewEventData newEventData = new NewEventData(titleTextView.getText().toString(),
                    locationTextView.getText().toString(), classListSpinner.getSelectedItem().toString(),
                    "", "", "", "", "");
            data.putExtra("new_event_data", newEventData);
            setResult(RESULT_OK, data);
        }
        else{
            throw new IllegalArgumentException("On click called from unknown view.");
        }
    }

    @Override
    public void onTimeSet(LocalTime selectedTime) {
        timeTextView.setText(selectedTime.toString("hh:mm a"));
    }
}
