package edu.purdue.cs.sigapp.studytables.classes.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import edu.purdue.cs.sigapp.studytables.R;
import edu.purdue.cs.sigapp.studytables.classes.CoursesListAdapter;
import edu.purdue.cs.sigapp.studytables.classes.OnCourseClickListener;
import edu.purdue.cs.sigapp.studytables.classes.OnSubjectClickedListener;
import edu.purdue.cs.sigapp.studytables.classes.SubjectsListAdapter;
import edu.purdue.cs.sigapp.studytables.client.purdueio.ODataResponse;
import edu.purdue.cs.sigapp.studytables.client.purdueio.PurdueIOClient;
import edu.purdue.cs.sigapp.studytables.client.purdueio.model.PurdueCourse;
import edu.purdue.cs.sigapp.studytables.client.purdueio.model.PurdueSubject;
import edu.purdue.cs.sigapp.studytables.client.purdueio.ApiInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ClassesActivity extends AppCompatActivity
        implements OnSubjectClickedListener, OnCourseClickListener {
    private RecyclerView mRecyclerView;
    private SubjectsListAdapter subjectsListAdapter;

    private ApiInterface apiInterface;
    private List<PurdueSubject> subjects;

    private CoursesListAdapter coursesListAdapter;

    @Bind(R.id.location_activity_toolbar)
    Toolbar mToolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classes);
        ButterKnife.bind(this);
        apiInterface = PurdueIOClient.getClient().create(ApiInterface.class);

        initRecyclerView();

        loadPurdueIOSubjects();

        initToolbar();
    }

    private void initToolbar() {
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Classes List");
    }

    private void initRecyclerView() {
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_purdue_classes);
        GridLayoutManager layoutManager = new GridLayoutManager(getApplicationContext(), 2);
        mRecyclerView.setLayoutManager(layoutManager);
    }

    private void getPurdueIOClassesForSubject(PurdueSubject subject) {
        Call<ODataResponse<PurdueCourse>> call = apiInterface
                .getAllCoursesForSubject("Subject/Abbreviation eq '"+subject.getAbbreviation()+"'");
        call.enqueue(new Callback<ODataResponse<PurdueCourse>>() {
            @Override
            public void onResponse(Call<ODataResponse<PurdueCourse>> call, Response<ODataResponse<PurdueCourse>> response) {
                List<PurdueCourse> courses = response.body().getTerms();

                coursesListAdapter = new CoursesListAdapter(courses, ClassesActivity.this);
                mRecyclerView.swapAdapter(coursesListAdapter, true);
            }

            @Override
            public void onFailure(Call<ODataResponse<PurdueCourse>> call, Throwable t) {
                //TODO: Handle failure.
            }
        });
    }

    private void loadPurdueIOSubjects() {
        Call<ODataResponse<PurdueSubject>> call = apiInterface.getAllSubjects();
        call.enqueue(new Callback<ODataResponse<PurdueSubject>>() {
            @Override
            public void onResponse(Call<ODataResponse<PurdueSubject>> call, Response<ODataResponse<PurdueSubject>> response) {
                subjects = response.body().getTerms();
                Log.d("Subjects",subjects.size() + "");
                subjectsListAdapter = new SubjectsListAdapter(subjects, ClassesActivity.this);
                mRecyclerView.setAdapter(subjectsListAdapter);
            }

            @Override
            public void onFailure(Call<ODataResponse<PurdueSubject>> call, Throwable t) {
                Log.e("Subjects",t.getMessage());
                //TODO: Handle failure.
            }
        });
    }

    @Override
    public void onSubjectClicked(PurdueSubject subject) {
        //empty the list of subjects.

        getPurdueIOClassesForSubject(subject);
    }

    @Override
    public void onCourseClicked(PurdueCourse course) {
        Intent classListIntent = new Intent(this, ClassDetailsActivity.class);
        startActivity(classListIntent);
    }
}
