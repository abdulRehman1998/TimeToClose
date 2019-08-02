package com.example.timetoclose;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProfileSetUp extends AppCompatActivity {

    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_set_up);

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
}
