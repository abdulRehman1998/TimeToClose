package com.example.timetoclose;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class LogIn extends AppCompatActivity {

    Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        ConstraintLayout mLayout=(ConstraintLayout)findViewById(R.id.layout_login);

        mLayout.setOnTouchListener(new OnSwipeTouchListener(LogIn.this) {

            public void onSwipeLeft() {
                startActivity(new Intent(LogIn.this,EmailVerification.class));
                finish();
            }

        });

        btnRegister =(Button)findViewById(R.id.btn_register_userlogin);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LogIn.this,CreateAccount.class));
                finish();

            }
        });

    }



}
