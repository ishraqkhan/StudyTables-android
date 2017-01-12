package edu.purdue.cs.sigapp.studytables.classes.activity;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

import edu.purdue.cs.sigapp.studytables.R;

/**
 * Created by mvieck on 1/11/17.
 */

public class ClassAdapter extends RecyclerView.Adapter<ClassAdapter.PurdueClassViewHolder> {

    List<PurdueClass> classList;

    public ClassAdapter(List<PurdueClass> classList) {
        this.classList = classList;
    }

    @Override
    public PurdueClassViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.purdue_class_cardview, parent, false);
        return new PurdueClassViewHolder(v);
    }

    @Override
    public void onBindViewHolder(PurdueClassViewHolder holder, int pos) {
        holder.classTitle.setText(classList.get(pos).getTitle());
        holder.classCrn.setText(classList.get(pos).getNumber()+"");
    }

    @Override
    public int getItemCount() {
        return classList.size();
    }

    public static class PurdueClassViewHolder extends RecyclerView.ViewHolder {
        private CardView cardView;
        private TextView classTitle;
        private TextView classCrn;
        public PurdueClassViewHolder(View itemView) {
            super(itemView);
            cardView = (CardView) itemView.findViewById(R.id.class_cardview);
            classTitle = (TextView) itemView.findViewById(R.id.class_title);
            classCrn = (TextView) itemView.findViewById(R.id.class_crn);
        }
    }


}
