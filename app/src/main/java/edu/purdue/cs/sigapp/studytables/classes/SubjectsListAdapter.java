package edu.purdue.cs.sigapp.studytables.classes;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import edu.purdue.cs.sigapp.studytables.R;
import edu.purdue.cs.sigapp.studytables.client.purdueio.model.PurdueSubject;

/**
 * Created by mvieck on 1/11/17.
 */

public class SubjectsListAdapter
        extends RecyclerView.Adapter<PurdueClassViewHolder> {

    private final OnSubjectClickedListener subjectClickListener;
    List<PurdueSubject> subjectList;

    public SubjectsListAdapter(List<PurdueSubject> subjectList, OnSubjectClickedListener listener) {
        this.subjectList = subjectList;
        this.subjectClickListener = listener;
    }

    @Override
    public PurdueClassViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.purdue_class_cardview, parent, false);
        return new PurdueClassViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final PurdueClassViewHolder holder, final int pos) {
        holder.classTitle.setText(subjectList.get(pos).getName());
        holder.classCrn.setText(subjectList.get(pos).getAbbreviation());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                subjectClickListener
                        .onSubjectClicked(subjectList
                                .get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return subjectList.size();
    }

}
