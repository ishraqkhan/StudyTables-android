package edu.purdue.cs.sigapp.studytables.classes.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import edu.purdue.cs.sigapp.studytables.R;

public class ClassesActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private ClassAdapter classAdapter;

    private List<PurdueClass> mockedClasses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classes);
        mockClassData();
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
}
