package com.example.timetoclose;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;

public class UpgradeAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upgrade_account);

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
