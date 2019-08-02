package com.example.timetoclose;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CreateAccount extends AppCompatActivity {

    Button btnToLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);



        setTerms();


        btnToLogin = (Button)findViewById(R.id.btn_login_userlogin);
        btnToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CreateAccount.this,LogIn.class));
                finish();

            }
        });


    }

    void setTerms(){
        String terms1=getResources().getString(R.string.terms1);
        String terms2=getResources().getString(R.string.terms2);
        String terms3=getResources().getString(R.string.terms3);
        TextView txtTerms =(TextView)findViewById(R.id.txt_terms);
        txtTerms.setGravity(Gravity.CENTER);
        String text = "<font color=#FFFFFF>"+terms1+"</font> <u><font color=#51B9F9>"+terms2+"</font></u> <font color=#FFFFFF>"+terms3+"</font>";
        txtTerms.setText(Html.fromHtml(text));
    }



}
