package edu.purdue.cs.sigapp.studytables;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import java.util.Arrays;
import java.util.UUID;

import butterknife.Bind;
import butterknife.ButterKnife;
import edu.purdue.cs.sigapp.studytables.classes.CoursesListAdapter;
import edu.purdue.cs.sigapp.studytables.classes.OnCourseClickListener;
import edu.purdue.cs.sigapp.studytables.classes.activity.ClassesActivity;
import edu.purdue.cs.sigapp.studytables.client.purdueio.model.PurdueCourse;

public class HomescreenActivity extends AppCompatActivity
        implements OnCourseClickListener, SwipeRefreshLayout.OnRefreshListener {
    @Bind(R.id.recycler_view)
    RecyclerView recyclerView;
    @Bind(R.id.location_activity_toolbar)
    Toolbar toolbar;
//    @Bind(R.id.progressBar) ProgressBar mLoadingProgressBar;
    @Bind(R.id.location_list_puller)
    SwipeRefreshLayout mSwipeRefreshLayout;
    @Bind(R.id.homescreen_fab)
    FloatingActionButton fab;
//    @Bind((R.id.location_error_text)) TextView errorTextView;
//    @Bind(R.id.location_error_button) Button errorButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen);
        ButterKnife.bind(this);

        initToolbar();
        initRecyclerView();
        mSwipeRefreshLayout.setOnRefreshListener(this);
        mSwipeRefreshLayout.setRefreshing(true);
        onRefresh();

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent classListIntent = new Intent(HomescreenActivity.this, ClassesActivity.class);
                startActivity(classListIntent);
            }
        });
    }


    @Override
    protected void onStart() {
        super.onStart();
    }

    private void initToolbar() {
        setSupportActionBar(toolbar);
    }

    private void initRecyclerView() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
    }

    @Override
    public void onCourseClicked(PurdueCourse course) {
        Toast.makeText(this,
                "You clicked a user's fake course. Do something here", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onRefresh() {
        mSwipeRefreshLayout.setRefreshing(false);
        recyclerView.setAdapter(new CoursesListAdapter(Arrays.asList(
                PurdueCourse.createDummyForString("My first class"),
                PurdueCourse.createDummyForString("My second class"),
                PurdueCourse.createDummyForString("My third class"),
                PurdueCourse.createDummyForString("My first class"),
                PurdueCourse.createDummyForString("My second class"),
                PurdueCourse.createDummyForString("My third class"),
                PurdueCourse.createDummyForString("My first class"),
                PurdueCourse.createDummyForString("My second class"),
                PurdueCourse.createDummyForString("My third class"),
                PurdueCourse.createDummyForString("My first class"),
                PurdueCourse.createDummyForString("My second class"),
                PurdueCourse.createDummyForString("My third class"),
                PurdueCourse.createDummyForString("My first class"),
                PurdueCourse.createDummyForString("My second class"),
                PurdueCourse.createDummyForString("My third class")
        ), this));
    }
}
