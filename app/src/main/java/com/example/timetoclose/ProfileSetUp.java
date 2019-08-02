package com.example.timetoclose;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;

public class ProfileSetUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_set_up);

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
