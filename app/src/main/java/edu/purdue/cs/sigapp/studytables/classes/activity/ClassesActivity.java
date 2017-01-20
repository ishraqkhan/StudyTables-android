package edu.purdue.cs.sigapp.studytables.classes.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import edu.purdue.cs.sigapp.studytables.R;
import edu.purdue.cs.sigapp.studytables.client.ODataResponse;
import edu.purdue.cs.sigapp.studytables.client.PurdueIOClient;
import edu.purdue.cs.sigapp.studytables.interfaces.ApiInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ClassesActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private ClassAdapter classAdapter;

    private ApiInterface apiInterface;
    private List<PurdueClass> mockedClasses;
    private List<PurdueSubject> subjects;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classes);
        apiInterface = PurdueIOClient.getClient().create(ApiInterface.class);
        mockClassData();
        getPurdueIOSubjects();
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_purdue_classes);
        classAdapter = new ClassAdapter(mockedClasses);
        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setAdapter(classAdapter);
    }

    private void mockClassData() {
        mockedClasses = new ArrayList<>();
        mockedClasses.add(new PurdueClass(25000,"Computer Architecture", 5, "A class meant for learning assembly."));
        mockedClasses.add(new PurdueClass(24000,"Introduction To C", 3, "Introduction to C programming at Purdue."));
        mockedClasses.add(new PurdueClass(10100,"History 101", 5, "A class meant for learning history."));
    }

    private void getPurdueIOClasses() {
        Call<ODataResponse<PurdueClass>> call = apiInterface.getAllClasses();
        call.enqueue(new Callback<ODataResponse<PurdueClass>>() {
            @Override
            public void onResponse(Call<ODataResponse<PurdueClass>> call, Response<ODataResponse<PurdueClass>> response) {
                mockedClasses = (List<PurdueClass>) response.body();
            }

            @Override
            public void onFailure(Call<ODataResponse<PurdueClass>> call, Throwable t) {

            }
        });
    }

    private void getPurdueIOSubjects() {
        Call<ODataResponse<PurdueSubject>> call = apiInterface.getAllSubjects();
        call.enqueue(new Callback<ODataResponse<PurdueSubject>>() {
            @Override
            public void onResponse(Call<ODataResponse<PurdueSubject>> call, Response<ODataResponse<PurdueSubject>> response) {
                subjects = response.body().getTerms();
                Log.d("Subjects Response",subjects.size() + "");
            }

            @Override
            public void onFailure(Call<ODataResponse<PurdueSubject>> call, Throwable t) {

            }
        });
    }
}
