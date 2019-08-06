package com.example.timetoclose;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ContactUs extends AppCompatActivity {

    EditText txtEmail;
    EditText txtMessage;
    Button btnSubmit;

    String mEmail;
    String mMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);

        txtEmail=(EditText)findViewById(R.id.txt_email_contact);
        txtMessage=(EditText)findViewById(R.id.txt_message_contact);

        btnSubmit=(Button)findViewById(R.id.btn_save_contact);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEmail=txtEmail.getText().toString();
                mMessage=txtMessage.getText().toString();
                inputChecks();

            }
        });


    }

    void inputChecks()
    {
        if (TextUtils.isEmpty(mEmail)) {
            txtEmail.setError("Please Enter Your E-mail Address");

        }
        if (TextUtils.isEmpty(mMessage)) {
            txtMessage.setError("Please Enter Message");

        }
    }
}
