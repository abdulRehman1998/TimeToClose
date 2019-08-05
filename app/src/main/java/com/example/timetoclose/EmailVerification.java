package com.example.timetoclose;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EmailVerification extends AppCompatActivity {

    Button btnBack;
    Button btnProceed;
    EditText txtCode;

    String mCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_verification);

        swipe();

        btnProceed=(Button)findViewById(R.id.btn_proceed_email_verification);
        btnProceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txtCode =(EditText)findViewById(R.id.txt_email_verification);
                mCode =txtCode.getText().toString();

                inputChecks();
            }

        });


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

    void inputChecks(){

        if (TextUtils.isEmpty(mCode)) {
            txtCode.setError("Please Enter the Code");

        }

    }

}
