package com.example.timetoclose;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EmailVerification extends AppCompatActivity {

    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_verification);

        swipe();

        btnBack =(Button)findViewById(R.id.btn_back_verify_email);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EmailVerification.this,ProfileSetUp.class));
                finish();
            }
        });




    }


    void swipe()
    {
        ConstraintLayout mLayout=(ConstraintLayout)findViewById(R.id.layout_email_verification);

        mLayout.setOnTouchListener(new OnSwipeTouchListener(EmailVerification.this) {

            public void onSwipeRight() {
                startActivity(new Intent(EmailVerification.this,LogIn.class));
                finish();
            }
            public void onSwipeLeft() {
                startActivity(new Intent(EmailVerification.this,NumberVerification.class));
                finish();
            }

        });
    }
}
