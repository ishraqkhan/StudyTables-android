package edu.purdue.cs.sigapp.studytables;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import java.util.Arrays;

import butterknife.Bind;
import butterknife.ButterKnife;
import edu.purdue.cs.sigapp.studytables.client.stucytablesapi.models.Event;
import edu.purdue.cs.sigapp.studytables.general.adapter.EventListAdapter;
import edu.purdue.cs.sigapp.studytables.scheduling.model.EventDetailsActivity;

public class ClassEventsActivity extends AppCompatActivity implements SwipeRefreshLayout.OnRefreshListener, OnEventClickedListener {

    @Bind(R.id.recycler_classevents)
    RecyclerView mClassFeed;

    @Bind(R.id.list_puller)
    SwipeRefreshLayout mSwipeRefreshLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_events);
        ButterKnife.bind(this);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Events for specific class");

        initRecyclerView();
        mSwipeRefreshLayout.setOnRefreshListener(this);
        mSwipeRefreshLayout.setRefreshing(true);
        onRefresh();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent classListIntent = new Intent(ClassEventsActivity.this, EventDetailsActivity.class);
                startActivity(classListIntent);
            }
        });
    }

    private void initRecyclerView() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mClassFeed.setLayoutManager(layoutManager);
    }

    @Override
    public void onRefresh() {
        mSwipeRefreshLayout.setRefreshing(false);
        mClassFeed.setAdapter(new EventListAdapter(Arrays.asList(
                Event.createDummyEventforString("One event"),
                Event.createDummyEventforString("Two event"),
                Event.createDummyEventforString("Three event"),
                Event.createDummyEventforString("Four event"),
                Event.createDummyEventforString("Five event"),
                Event.createDummyEventforString("Six event")
        ), this));
    }

    @Override
    public void onEventClicked(Event event) {
        Toast.makeText(this, "You clicked an event. Make this do something", Toast.LENGTH_SHORT).show();
    }
}
