package edu.purdue.cs.sigapp.studytables.create.event.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import edu.purdue.cs.sigapp.studytables.R;

public class CreateEventActivity extends AppCompatActivity {
    EditText eventName;
    EditText eventPlace;
    EditText eventDescription;
    Button createEvent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_event);

        // initialize text fields and button
        eventName = (EditText) findViewById(R.id.event_name);
        eventPlace = (EditText) findViewById(R.id.event_place);
        eventDescription = (EditText) findViewById(R.id.event_description);
        createEvent = (Button) findViewById(R.id.create_button);
    }
}
