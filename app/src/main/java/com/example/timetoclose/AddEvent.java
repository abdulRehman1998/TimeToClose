package com.example.timetoclose;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TimePicker;

public class AddEvent extends AppCompatActivity implements DatePickerDialog.OnDateSetListener, TimePickerDialog.OnTimeSetListener {

    LinearLayout layoutBuyer;
    LinearLayout layoutSeller;
    LinearLayout layoutAgents;
    LinearLayout layoutTitle;
    TextView txtBuyer;
    TextView txtSeller;
    TextView txtAgents;
    TextView txtTitle;
    TextView txtDate;
    TextView txtTime;
    ImageView imgCalender;
    EditText txtEventName;
    EditText txtNotes;
    Button btnAddEvent;

    String mEventName;
    String mNotes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_event);

        dateSelector();
        swipe();
        barSelector();
        emptyViewsCheck();


    }

    void inputChecks()
    {

        if (TextUtils.isEmpty(mEventName)) {
            txtEventName.setError("Please Enter Your E-mail Address");

        }
        if (TextUtils.isEmpty(mNotes)) {
            txtNotes.setError("Please Enter Your Correct Password");

        }
    }

    void  emptyViewsCheck()
    { btnAddEvent=(Button)findViewById(R.id.btn_submit_add_event);
        btnAddEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txtEventName =(EditText)findViewById(R.id.txt_event_name_add);
                txtNotes=(EditText)findViewById(R.id.txt_note_add_event);
                mEventName=txtEventName.getText().toString();
                mNotes=txtNotes.getText().toString();

                inputChecks();

            }
        });
    }
    void dateSelector()
    { imgCalender=(ImageView)findViewById(R.id.img_calender);
        txtTime=(TextView)findViewById(R.id.txt_event_time_add);
        txtDate=(TextView)findViewById(R.id.txt_event_date_add);
        imgCalender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                new TimePickerDialog(AddEvent.this,AddEvent.this,00, 00, true).show();

                DatePickerDialog dialog = new DatePickerDialog(AddEvent.this, AddEvent.this, 2013, 2, 18);
                dialog.show();


            }
        });
    }

    void barSelector()
    {   layoutBuyer=(LinearLayout)findViewById(R.id.layout_buyer_addevent);
        layoutSeller=(LinearLayout)findViewById(R.id.layout_seller_addevent);
        layoutAgents=(LinearLayout)findViewById(R.id.layout_agents_addevent);
        layoutTitle=(LinearLayout)findViewById(R.id.layout_title_addevent);
        txtBuyer=(TextView)findViewById(R.id.txtBuyer);
        txtSeller=(TextView)findViewById(R.id.txtSeller);
        txtAgents=(TextView)findViewById(R.id.txtAgents);
        txtTitle=(TextView)findViewById(R.id.txtTitle);


        layoutBuyer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layoutSelect(layoutBuyer,txtBuyer);
            }
        });

        layoutTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layoutSelect(layoutTitle,txtTitle);
            }
        });

        layoutSeller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layoutSelect(layoutSeller,txtSeller);
            }
        });

        layoutAgents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layoutSelect(layoutAgents,txtAgents);
            }
        });

    }

    void swipe()
    {
        ConstraintLayout mLayout=(ConstraintLayout)findViewById(R.id.layout_add_event);

        mLayout.setOnTouchListener(new OnSwipeTouchListener(AddEvent.this) {

            public void onSwipeRight() {
                startActivity(new Intent(AddEvent.this,UpgradeAccount.class));
                finish();
            }

        });

    }

    void selectorRepositioning()
    {
        txtAgents.setTextColor(getResources().getColor(R.color.appbar_left));
        txtTitle.setTextColor(getResources().getColor(R.color.appbar_left));
        txtSeller.setTextColor(getResources().getColor(R.color.appbar_left));
        txtBuyer.setTextColor(getResources().getColor(R.color.appbar_left));
        layoutBuyer.setBackgroundResource(0);
        layoutSeller.setBackgroundResource(0);
        layoutAgents.setBackgroundResource(0);
        layoutTitle.setBackgroundResource(0);
    }

    void layoutSelect(LinearLayout layout, TextView textView)
    {

        selectorRepositioning();
        layout.setBackgroundResource(R.drawable.selector_hollow_bar);
        textView.setTextColor(getResources().getColor(R.color.white));

    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

        txtDate.setText(dayOfMonth + "-"  +month + "-"+ year  );
    }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        txtTime.setText(hourOfDay + ":" + minute);
    }
}
