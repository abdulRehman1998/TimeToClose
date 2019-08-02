package com.example.timetoclose;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout mLayout=(ConstraintLayout)findViewById(R.id.layout_main);

        mLayout.setOnTouchListener(new OnSwipeTouchListener(MainActivity.this) {

            public void onSwipeLeft() {
                startActivity(new Intent(MainActivity.this,CreateAccount.class));
                finish();
            }

        });

    }
}
