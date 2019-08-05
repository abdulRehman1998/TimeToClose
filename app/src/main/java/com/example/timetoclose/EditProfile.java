package com.example.timetoclose;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.vansuita.pickimage.bean.PickResult;
import com.vansuita.pickimage.bundle.PickSetup;
import com.vansuita.pickimage.dialog.PickImageDialog;
import com.vansuita.pickimage.listeners.IPickResult;

import de.hdodenhof.circleimageview.CircleImageView;

public class EditProfile extends AppCompatActivity  implements IPickResult {

    CheckBox cbAgent;
    CheckBox cbBuyerSeller;
    CheckBox cbAttorney;
    CheckBox cbTitleAgent;
    EditText txtName;
    EditText txtEmail;
    EditText txtPhone;
    EditText txtFirmName;
    Button btnSaveEditProfile;
    CircleImageView circularImageView;

    String mName;
    String mEmail;
    String mPhone;
    String mFirmName;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        circularImageView =(CircleImageView)findViewById(R.id.img_person_edit_profile);
        circularImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    PickImageDialog.build(new PickSetup()).show(EditProfile.this);

            }
        });


        btnSaveEditProfile=(Button)findViewById(R.id.btn_save_edit_profile);
        btnSaveEditProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtName=(EditText)findViewById(R.id.txt_name_edit_rofile);
                txtEmail=(EditText)findViewById(R.id.txt_email_edit_rofile);
                txtPhone=(EditText)findViewById(R.id.txt_phone_edit_rofile);
                txtFirmName=(EditText)findViewById(R.id.txt_firm_name_edit_rofile);

                mName=txtName.getText().toString();
                mEmail=txtEmail.getText().toString();
                mPhone=txtPhone.getText().toString();
                mFirmName=txtFirmName.getText().toString();

                inputChecks();

            }
        });



         checkBoxesListner();

    }

    void inputChecks()
    {
        if (TextUtils.isEmpty(mEmail)) {
            txtEmail.setError("Please Enter Your E-mail Address");

        }
        if (TextUtils.isEmpty(mName)) {
            txtName.setError("Please Enter Your Name");

        }

        if (TextUtils.isEmpty(mFirmName)) {
            txtFirmName.setError("Please Enter Your Firm Name");

        }
        if (TextUtils.isEmpty(mPhone)) {
            txtPhone.setError("Please Enter Your Phone Number");

        }
    }

    void checkBoxesListner()
    {
        cbAgent=(CheckBox)findViewById(R.id.cb_agent);
        cbAttorney=(CheckBox)findViewById(R.id.cb_attorney);
        cbBuyerSeller=(CheckBox)findViewById(R.id.cb_buyer_seller);
        cbTitleAgent=(CheckBox)findViewById(R.id.cb_title_agent);

        cbAgent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                cbChecked(cbAgent);
            }
        });
        cbTitleAgent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                cbChecked(cbTitleAgent);
            }
        });
        cbBuyerSeller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                cbChecked(cbBuyerSeller);
            }
        });
        cbAttorney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                cbChecked(cbAttorney);
            }
        });

    }
    void cbChecked(CheckBox checkBox)
    {
        cbRepositioning();
        checkBox.setChecked(true);

    }

    void cbRepositioning()
    {
        cbAgent.setChecked(false);
        cbAttorney.setChecked(false);
        cbBuyerSeller.setChecked(false);
        cbTitleAgent.setChecked(false);


    }

    @Override
    public void onPickResult(PickResult r) {

        circularImageView.setImageBitmap(r.getBitmap());
    }
}
