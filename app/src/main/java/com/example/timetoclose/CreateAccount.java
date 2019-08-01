package com.example.timetoclose;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.view.Gravity;
import android.widget.TextView;

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



    }
}
