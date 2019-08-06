package com.example.timetoclose;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NumberVerification extends AppCompatActivity {

    Button btnProceed;
    Button btnBack;
    EditText txtCode;

    String mCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_verification);

        btnProceed=(Button)findViewById(R.id.btn_proceed_number_verfication);
        btnProceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtCode =(EditText)findViewById(R.id.txt_number_verication);
                mCode=txtCode.getText().toString();

                inputChecks();
            }
        });

        swipe();

        btnBack =(Button)findViewById(R.id.btn_back_verify_no);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NumberVerification.this,EmailVerification.class));
                finish();
            }
        });


    }

    void swipe()
    {

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

    void inputChecks(){

        if (TextUtils.isEmpty(mCode)) {
            txtCode.setError("Please Enter the Code");

        }

    }


}

