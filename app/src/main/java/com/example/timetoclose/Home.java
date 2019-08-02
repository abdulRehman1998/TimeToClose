package com.example.timetoclose;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Home extends AppCompatActivity {

    ImageView imgNotification;
    ImageView imgTransection;
    ImageView imgUpgrade;
    ImageView imgSettings;
    ImageView imgSupport;
    ImageView imgProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        swipe();

        imgNotification=(ImageView)findViewById(R.id.img_home_notifications);
        imgProfile=(ImageView)findViewById(R.id.img_home_profile);
        imgUpgrade=(ImageView)findViewById(R.id.img_home_upgrade);
        imgSupport=(ImageView)findViewById(R.id.img_home_support);
        imgSettings=(ImageView)findViewById(R.id.img_home_settings);
        imgTransection=(ImageView)findViewById(R.id.img_home_transactions);

        imgSupport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Home.this,ContactUs.class));
                finish();
            }
        });

        imgUpgrade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Home.this,UpgradeAccount.class));
                finish();
            }
        });

    }


    void swipe()
    {
        ConstraintLayout mLayout=(ConstraintLayout)findViewById(R.id.layout_home);
        mLayout.setOnTouchListener(new OnSwipeTouchListener(Home.this) {

            public void onSwipeRight() {
                startActivity(new Intent(Home.this,NumberVerification.class));
                finish();
            }
            public void onSwipeLeft() {
                startActivity(new Intent(Home.this,ProfileSetUp.class));
                finish();
            }

        });}


}
