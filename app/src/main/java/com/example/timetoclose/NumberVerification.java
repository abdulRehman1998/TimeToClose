package com.example.timetoclose;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;

public class NumberVerification extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_verification);

        ConstraintLayout mLayout=(ConstraintLayout)findViewById(R.id.layout_no_verification);

        mLayout.setOnTouchListener(new OnSwipeTouchListener(NumberVerification.this) {

            public void onSwipeRight() {
                startActivity(new Intent(NumberVerification.this,EmailVerification.class));
                finish();
            }
            public void onSwipeLeft() {
                startActivity(new Intent(NumberVerification.this,Home.class));
                finish();
            }

        });

    }
}
