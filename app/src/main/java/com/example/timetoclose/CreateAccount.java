package com.example.timetoclose;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CreateAccount extends AppCompatActivity {

    Button btnToLogin;
    Button btnRegister;
    EditText txtName;
    EditText txtEmail;
    EditText txtPass;
    EditText txtConfirmPass;

    String mName;
    String mEmail;
    String mPass;
    String mConfirmPass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        btnRegister =(Button)findViewById(R.id.btn_register_register);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txtName=(EditText)findViewById(R.id.txt_name_register);
                txtEmail=(EditText)findViewById(R.id.txt_email_register);
                txtPass=(EditText)findViewById(R.id.txt_password_register);
                txtConfirmPass=(EditText)findViewById(R.id.txt_confirm_pass_register);

                mEmail=txtEmail.getText().toString();
                mName=txtName.getText().toString();
                mPass=txtPass.getText().toString();
                mConfirmPass=txtConfirmPass.getText().toString();

                inputChecks();


            }
        });


        setTerms();


        btnToLogin = (Button)findViewById(R.id.btn_login_login);
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

    void inputChecks(){

        if (TextUtils.isEmpty(mEmail)) {
            txtEmail.setError("Please Enter Your E-mail Address");

        }
        if (TextUtils.isEmpty(mName)) {
            txtName.setError("Please Enter Your Name");

        }
        if (TextUtils.isEmpty(mPass)) {
            txtPass.setError("Please Enter Your Password");

        }
        if (TextUtils.isEmpty(mConfirmPass)) {
            txtConfirmPass.setError("Please Confirm Your Password");

        }

        if (!mPass.equals(mConfirmPass)) {
            txtConfirmPass.setError("Incorrect! Please Confirm Your Password again");

        }
    }


}
