package com.example.timetoclose;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;

public class LogIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        ConstraintLayout mLayout=(ConstraintLayout)findViewById(R.id.layout_login);

        mLayout.setOnTouchListener(new OnSwipeTouchListener(LogIn.this) {

            public void onSwipeRight() {
                startActivity(new Intent(LogIn.this,CreateAccount.class));
                finish();
            }
            public void onSwipeLeft() {
                startActivity(new Intent(LogIn.this,EmailVerification.class));
                finish();
            }

        });

    }
}
