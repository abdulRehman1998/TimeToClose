package com.example.timetoclose;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.Gravity;
import android.widget.TextView;
import android.widget.Toast;

public class CreateAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
        String terms1=getResources().getString(R.string.terms1);
        String terms2=getResources().getString(R.string.terms2);
        String terms3=getResources().getString(R.string.terms3);
        TextView txtTerms =(TextView)findViewById(R.id.txt_terms);
        txtTerms.setGravity(Gravity.CENTER);
        String text = "<font color=#FFFFFF>"+terms1+"</font> <u><font color=#51B9F9>"+terms2+"</font></u> <font color=#FFFFFF>"+terms3+"</font>";
        txtTerms.setText(Html.fromHtml(text));

        ConstraintLayout mLayout=(ConstraintLayout)findViewById(R.id.create_account_layout);

        mLayout.setOnTouchListener(new OnSwipeTouchListener(CreateAccount.this) {

            public void onSwipeRight() {
                startActivity(new Intent(CreateAccount.this,MainActivity.class));
                finish();
            }
            public void onSwipeLeft() {
                startActivity(new Intent(CreateAccount.this,LogIn.class));
                finish();
            }

        });



    }
}
