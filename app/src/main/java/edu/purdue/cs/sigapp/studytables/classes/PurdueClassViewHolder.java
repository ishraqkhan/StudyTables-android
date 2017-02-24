package edu.purdue.cs.sigapp.studytables.classes;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import edu.purdue.cs.sigapp.studytables.R;

/**
 * Created by dmtsc on 2/23/2017.
 */

public class PurdueClassViewHolder extends RecyclerView.ViewHolder {
    protected CardView cardView;
    protected TextView classTitle;
    protected TextView classCrn;
    public PurdueClassViewHolder(View itemView) {
        super(itemView);
        cardView = (CardView) itemView.findViewById(R.id.class_cardview);
        classTitle = (TextView) itemView.findViewById(R.id.class_title);
        classCrn = (TextView) itemView.findViewById(R.id.class_crn);
    }
}
