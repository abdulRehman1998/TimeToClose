package com.example.timetoclose;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ProfileSetUp extends AppCompatActivity {

    Button btnBack;
    Button btnProceed;
    EditText txtCompanyName;
    EditText txtEmail;
    EditText txtPhone;

    String mCompanyName;
    String mEmail;
    String mNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_set_up);

        btnProceed=(Button)findViewById(R.id.btn_proceed_profile_setup);
        btnProceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txtEmail=(EditText)findViewById(R.id.txt_email_profileSet);
                txtCompanyName=(EditText)findViewById(R.id.txt_company_name_profileSet);
                txtPhone=(EditText)findViewById(R.id.txt_phone_profileSet);

                mEmail=txtEmail.getText().toString();
                mCompanyName=txtCompanyName.getText().toString();
                mNumber=txtPhone.getText().toString();

                inputChecks();

            }
        });


        btnBack =(Button)findViewById(R.id.btn_back_profil_setUp);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProfileSetUp.this,CreateAccount.class));
                finish();
            }
        });

        swipe();
    }


    void swipe()
    {
        ConstraintLayout mLayout=(ConstraintLayout)findViewById(R.id.layout_profile);

        mLayout.setOnTouchListener(new OnSwipeTouchListener(ProfileSetUp.this) {

            public void onSwipeRight() {
                startActivity(new Intent(ProfileSetUp.this,Home.class));
                finish();
            }
            public void onSwipeLeft() {
                startActivity(new Intent(ProfileSetUp.this,UpgradeAccount.class));
                finish();
            }

        });
    }

    void inputChecks(){

        if (TextUtils.isEmpty(mEmail)) {
            txtEmail.setError("Please Enter Your E-mail Address");

        }
        if (TextUtils.isEmpty(mCompanyName)) {
            txtCompanyName.setError("Please Enter Your Name");

        }
        if (TextUtils.isEmpty(mNumber)) {
            txtPhone.setError("Please Enter Your Password");

        }

    }


}

