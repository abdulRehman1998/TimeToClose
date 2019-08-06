package com.example.timetoclose;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.timetoclose.Adapters.NotificationEventsAdapter;

public class TransactionEvents extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction_events);

        RecyclerView rvTransactionEvents = findViewById(R.id.rv_transaction_events);
        NotificationEventsAdapter notificationEventsAdapter = new NotificationEventsAdapter();
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        rvTransactionEvents.setLayoutManager(layoutManager);
        rvTransactionEvents.setAdapter(notificationEventsAdapter);

    }
}
