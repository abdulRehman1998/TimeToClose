package com.example.timetoclose;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ConstraintLayout mLayout=(ConstraintLayout)findViewById(R.id.layout_home);

        mLayout.setOnTouchListener(new OnSwipeTouchListener(Home.this) {

            public void onSwipeRight() {
                startActivity(new Intent(Home.this,NumberVerification.class));
                finish();
            }
            public void onSwipeLeft() {
                startActivity(new Intent(Home.this,ProfileSetUp.class));
                finish();
            }

        });
    }
}
