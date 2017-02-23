package edu.purdue.cs.sigapp.studytables.scheduling.model;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import edu.purdue.cs.sigapp.studytables.R;

public class EventDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_details);

        Button editbutton = (Button) findViewById(R.id.btn_edit_event);
        editbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(EventDetailsActivity.this, "This is where the event can be edited.", Toast.LENGTH_SHORT).show();
                //Load the content that is displayed in this activity into the intent. And show it on the create new event Activity

                //Intent editEventActivity = new Intent(this, NewEventActivity.class);
                //startActivityForResult(editEventActivity);
            }
        });
    }
}
