package com.example.timetoclose;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.timetoclose.Adapters.MyTransactionsAdapter;
import com.example.timetoclose.Adapters.NotificationsAdapter;

public class Notifications extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);

        RecyclerView rvNotifications = findViewById(R.id.rv_notifications);
        NotificationsAdapter notificationsAdapter = new NotificationsAdapter();
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        rvNotifications.setLayoutManager(lm);
        rvNotifications.setAdapter(notificationsAdapter);
    }
}
