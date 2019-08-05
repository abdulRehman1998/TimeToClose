package com.example.timetoclose.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.timetoclose.R;

public class EventsTransactionAdapter extends RecyclerView.Adapter<EventsTransactionAdapter.ViewHolder> {
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.transection_event_card, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 4;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvEventName;
        TextView tvDueFrom;
        TextView tvEventDateTime;
        TextView tvNote;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvEventName = itemView.findViewById(R.id.event_name);
            tvEventDateTime = itemView.findViewById(R.id.tv_event_date_time);
            tvDueFrom = itemView.findViewById(R.id.tv_due_from);
            tvNote = itemView.findViewById(R.id.tv_note);


        }
    }
}
