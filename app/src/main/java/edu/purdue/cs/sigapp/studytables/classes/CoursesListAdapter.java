package edu.purdue.cs.sigapp.studytables.classes;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import edu.purdue.cs.sigapp.studytables.R;
import edu.purdue.cs.sigapp.studytables.client.purdueio.model.PurdueCourse;

/**
 * Created by mvieck on 1/11/17.
 */

public class CoursesListAdapter
        extends RecyclerView.Adapter<PurdueClassViewHolder> {

    private final OnCourseClickListener subjectClickListener;
    List<PurdueCourse> courseList;

    public CoursesListAdapter(List<PurdueCourse> courseList, OnCourseClickListener listener) {
        this.courseList = courseList;
        this.subjectClickListener = listener;
    }

    @Override
    public PurdueClassViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.purdue_class_cardview, parent, false);
        return new PurdueClassViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final PurdueClassViewHolder holder, final int pos) {
        holder.classTitle.setText(courseList.get(pos).getTitle());
        holder.classCrn.setText(courseList.get(pos).getNumber());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                subjectClickListener
                        .onCourseClicked(courseList
                                .get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return courseList.size();
    }

}
