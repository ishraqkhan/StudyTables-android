package edu.purdue.cs.sigapp.studytables.classes.activity;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.joanzapata.iconify.IconDrawable;
import com.joanzapata.iconify.fonts.MaterialIcons;

import java.util.ArrayList;
import java.util.List;

import edu.purdue.cs.sigapp.studytables.R;
import edu.purdue.cs.sigapp.studytables.classes.OnSubjectClickedListener;
import edu.purdue.cs.sigapp.studytables.classes.SubjectsListAdapter;
import edu.purdue.cs.sigapp.studytables.client.ODataResponse;
import edu.purdue.cs.sigapp.studytables.client.PurdueIOClient;
import edu.purdue.cs.sigapp.studytables.client.model.PurdueClass;
import edu.purdue.cs.sigapp.studytables.client.model.PurdueCourse;
import edu.purdue.cs.sigapp.studytables.client.model.PurdueSubject;
import edu.purdue.cs.sigapp.studytables.client.ApiInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ClassesActivity extends AppCompatActivity implements OnSubjectClickedListener {
    private RecyclerView mRecyclerView;
    private SubjectsListAdapter subjectsListAdapter;

    private ApiInterface apiInterface;
    private List<PurdueClass> mockedClasses;
    private List<PurdueSubject> mockedSubjects;
    private List<PurdueSubject> subjects;
    private FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classes);
        apiInterface = PurdueIOClient.getClient().create(ApiInterface.class);
        initMockClassData();

        initRecyclerView();

        loadPurdueIOSubjects();

        initFab();
    }

    private void initFab() {
        this.fab = (FloatingActionButton) findViewById(R.id.fab_classlist_details);
        this.fab.setImageDrawable(new IconDrawable(this, MaterialIcons.md_info)
                .colorRes(android.R.color.white)
                .actionBarSize());

        this.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ClassesActivity.this, "This simulates clicking a class in the list. This FAB will not be the final way to do this.", Toast.LENGTH_LONG).show();

                Intent classListIntent = new Intent(ClassesActivity.this, ClassDetailsActivity.class);
                startActivity(classListIntent);
            }
        });
    }

    private void initRecyclerView() {
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_purdue_classes);
        GridLayoutManager layoutManager = new GridLayoutManager(getApplicationContext(), 2);
        mRecyclerView.setLayoutManager(layoutManager);
    }

    private void initMockClassData() {
        mockedSubjects = new ArrayList<>();
        mockedSubjects.add(new PurdueSubject("25000","Computer Science", "CS", new ArrayList<PurdueCourse>()));
        mockedSubjects.add(new PurdueSubject("45000","Classics", "CLCS", new ArrayList<PurdueCourse>()));
        mockedSubjects.add(new PurdueSubject("55000","History", "HIST", new ArrayList<PurdueCourse>()));
    }

    private void getPurdueIOClasses() {
        Call<ODataResponse<PurdueClass>> call = apiInterface.getAllClasses();
        call.enqueue(new Callback<ODataResponse<PurdueClass>>() {
            @Override
            public void onResponse(Call<ODataResponse<PurdueClass>> call, Response<ODataResponse<PurdueClass>> response) {
                mockedClasses = response.body().getTerms();
            }

            @Override
            public void onFailure(Call<ODataResponse<PurdueClass>> call, Throwable t) {

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
            }
        });
    }

    @Override
    public void onSubjectClicked(PurdueSubject subject) {
        //empty the list of subjects.
        //getPurdueIOClasses(); //this will fill on complete.

        Toast.makeText(this, "The subject was clicked. Open the class list now", Toast.LENGTH_SHORT).show();
    }
}
