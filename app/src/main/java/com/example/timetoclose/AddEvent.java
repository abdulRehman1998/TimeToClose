package com.example.timetoclose;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;

public class AddEvent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_event);

        ConstraintLayout mLayout=(ConstraintLayout)findViewById(R.id.layout_add_event);

        mLayout.setOnTouchListener(new OnSwipeTouchListener(AddEvent.this) {

            public void onSwipeRight() {
                startActivity(new Intent(AddEvent.this,UpgradeAccount.class));
                finish();
            }

        });

    }
}
