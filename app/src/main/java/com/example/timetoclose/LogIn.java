package com.example.timetoclose;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;


public class LogIn extends AppCompatActivity{

    EditText txtEmail;
    EditText txtPass;
    Button btnRegister;
    Button btnLogin;

    String mEmail;
    String mPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);




        btnLogin=(Button)findViewById(R.id.btn_login_login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txtPass =(EditText)findViewById(R.id.txt_password_login);
                txtEmail =(EditText)findViewById(R.id.txt_email_verification);
                mEmail=txtEmail.getText().toString();
                mPass=txtPass.getText().toString();

                inputChecks();

            }
        });





       swipe();

        btnRegister =(Button)findViewById(R.id.btn_register_register);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LogIn.this,CreateAccount.class));
                finish();

            }
        });

    }

    void swipe(){

        ConstraintLayout mLayout=(ConstraintLayout)findViewById(R.id.layout_login);
        mLayout.setOnTouchListener(new OnSwipeTouchListener(LogIn.this) {

            public void onSwipeLeft() {
                startActivity(new Intent(LogIn.this,EmailVerification.class));
                finish();
            }

        });
    }

    void inputChecks()
    {
        if (TextUtils.isEmpty(mEmail)) {
            txtEmail.setError("Please Enter Your E-mail Address");

        }
        if (TextUtils.isEmpty(mPass)) {
            txtPass.setError("Please Enter Your Correct Password");

        }
    }

}
