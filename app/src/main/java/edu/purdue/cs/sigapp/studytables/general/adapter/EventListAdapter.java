package edu.purdue.cs.sigapp.studytables.general.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import edu.purdue.cs.sigapp.studytables.OnEventClickedListener;
import edu.purdue.cs.sigapp.studytables.R;
import edu.purdue.cs.sigapp.studytables.client.stucytablesapi.models.Event;

/**
 * Created by dmtsc on 4/6/2017.
 */

public class EventListAdapter extends RecyclerView.Adapter<EventListAdapter.EventViewHolder> {
    private final List<Event> events;
    private final OnEventClickedListener listener;

    public EventListAdapter(List<Event> events, OnEventClickedListener listener) {
        this.events = events;
        this.listener = listener;
    }

    @Override
    public EventViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.event_list_item, parent, false);
        return new EventViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final EventViewHolder holder, int position) {
        holder.title.setText(events.get(position).getTitle());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onEventClicked(events.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return events.size();
    }

    class EventViewHolder extends RecyclerView.ViewHolder {
            @Bind(R.id.event_list_item_title)
            TextView title;

            EventViewHolder(View itemView) {
                super(itemView);
                ButterKnife.bind(this, itemView);
            }
        }
}

