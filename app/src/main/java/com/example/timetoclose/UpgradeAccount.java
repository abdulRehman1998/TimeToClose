package com.example.timetoclose;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UpgradeAccount extends AppCompatActivity {

    Button btnBackToHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upgrade_account);

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
}
