package edu.purdue.cs.sigapp.studytables.classes.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.joanzapata.iconify.IconDrawable;
import com.joanzapata.iconify.fonts.MaterialIcons;

import edu.purdue.cs.sigapp.studytables.R;
import edu.purdue.cs.sigapp.studytables.general.NewEventActivity;
import edu.purdue.cs.sigapp.studytables.general.NewEventData;
import edu.purdue.cs.sigapp.studytables.scheduling.model.EventDetailsActivity;

public class ClassDetailsActivity extends AppCompatActivity {

    //Note: This field should be moved into the CreateNewEvent Activity when it is merged in so it can be referenced in more places.
    static final int ENTER_NEW_EVENT = 31;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_details);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setImageDrawable(new IconDrawable(this, MaterialIcons.md_add));
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ClassDetailsActivity.this, "This is where the new event activity will be called.", Toast.LENGTH_SHORT).show();
                //This should use startActivityForResult to request an event to be created then return the event data to here.
                Intent classListIntent = new Intent(ClassDetailsActivity.this, NewEventActivity.class);
                startActivityForResult(classListIntent, ENTER_NEW_EVENT);
            }
        });

        Button eventDetails = (Button) findViewById(R.id.btn_event_details);
        eventDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ClassDetailsActivity.this, "This is where the details of a specific event are displayed", Toast.LENGTH_SHORT).show();
                Intent eventDetailsIntent = new Intent(ClassDetailsActivity.this, EventDetailsActivity.class);
                startActivity(eventDetailsIntent);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if(requestCode == ENTER_NEW_EVENT) {
           if(resultCode == RESULT_OK) {
               //This means that the activity creating the event succeeded and the data will be in the Intent.
               Bundle bundle = data.getExtras();
               NewEventData eventData = bundle.getParcelable(NewEventActivity.EVENT_DATA_EXTRA);
               Log.d("ClassDetailsActivity", "onActivityResult: " + eventData.title);

           }
        }

    }
}
