package edu.purdue.cs.sigapp.studytables;

import java.util.Calendar;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;

import edu.purdue.cs.sigapp.studytables.general.NewEventActivity;

public class MainActivity extends AppCompatActivity {
    private TimePicker timePicker1;
    private TextView time;
    private Calendar calendar;
    private String format = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timePicker1 = (TimePicker)findViewById(R.id.timePicker1);
        time = (TextView)findViewById(R.id.timeTextView);
        calendar = Calendar.getInstance();

        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int min = calendar.get(Calendar.MINUTE);
        showTime(hour,min);
    }

    public void setTime(View view){
        int hour = 0, minute = 0;

        //Doing version check since getCurrentHour and getCurrentMinute method is broken
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
            hour = timePicker1.getHour();
            minute = timePicker1.getMinute();
        }
        else if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M){
            hour = timePicker1.getCurrentHour().intValue();
            minute = timePicker1.getCurrentMinute().intValue();
        }

        showTime(hour, minute);
    }

    public void showTime(int hour, int min){
        if(hour == 0){
            hour += 12;
            format = "AM";
        }
        else if (hour < 12){
            format = "AM";
        }
        else if (hour == 12){
            format = "PM";
        }
        else{
            hour -= 12;
            format = "PM";
        }

        time.setText(new StringBuilder().append(hour).append(" : ").append(min).append(" ").append(format));
    }

}
