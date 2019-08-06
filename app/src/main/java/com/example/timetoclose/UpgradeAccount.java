package com.example.timetoclose;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class UpgradeAccount extends AppCompatActivity {

    Button btnBackToHome;
    ImageView imgWeeklySelect;
    ImageView imgMonthlySelect;
    ImageView imgAnnualySelect;

    int radioCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upgrade_account);

        radioButtons();



        swipe();

        btnBackToHome= (Button)findViewById(R.id.btn_back_upgrade);
        btnBackToHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(UpgradeAccount.this,Home.class));
                finish();
            }
        });

    }



    void swipe(){
        ConstraintLayout mLayout=(ConstraintLayout)findViewById(R.id.layout_upgrade_accunt);

        mLayout.setOnTouchListener(new OnSwipeTouchListener(UpgradeAccount.this) {

            public void onSwipeRight() {
                startActivity(new Intent(UpgradeAccount.this,ProfileSetUp.class));
                finish();
            }
            public void onSwipeLeft() {
                startActivity(new Intent(UpgradeAccount.this,AddEvent.class));
                finish();
            }

        });

    }

    void radioButtons()
          {
        imgWeeklySelect=(ImageView)findViewById(R.id.img_weekly_select);
        imgMonthlySelect=(ImageView)findViewById(R.id.img_monthly_select);
        imgAnnualySelect=(ImageView)findViewById(R.id.img_annually_select);

        imgWeeklySelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                radioBtnCheck(imgWeeklySelect);
            }
        });
        imgMonthlySelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                radioBtnCheck(imgMonthlySelect);

            }
        });
        imgAnnualySelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                radioBtnCheck(imgAnnualySelect);
            }
        });}



        void radioRepositioning(ImageView imgView1,ImageView imgView2)
        {
            imgView1.setBackgroundResource(R.drawable.ic_ring);
            imgView2.setBackgroundResource(R.drawable.ic_ring);

        }

        void radioBtnCheck(ImageView imgView)
        {


        Bitmap bitmapRing = ((BitmapDrawable) getResources().getDrawable(R.drawable.ic_ring)).getBitmap();
        Bitmap bitmapSelected = ((BitmapDrawable) getResources().getDrawable(R.drawable.ic_selected)).getBitmap();
        Bitmap bitmapImageView = ((BitmapDrawable) imgView.getBackground()).getBitmap();

        if(imgView.getId() ==imgWeeklySelect.getId())
        {
            radioRepositioning(imgAnnualySelect,imgMonthlySelect);
        }
        if(imgView.getId() ==imgMonthlySelect.getId())
        {
            radioRepositioning(imgAnnualySelect,imgWeeklySelect);
        }
        if(imgView.getId() ==imgAnnualySelect.getId())
        {
            radioRepositioning(imgWeeklySelect,imgMonthlySelect);
        }

        if (bitmapRing==bitmapImageView)
        {
            imgView.setBackgroundResource(R.drawable.ic_selected);
        }

        if (bitmapImageView==bitmapSelected)
        {
            imgView.setBackgroundResource(R.drawable.ic_ring);
        }

    }
}
