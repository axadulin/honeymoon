package onlyup.crud.honeymoon.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import onlyup.crud.honeymoon.MainActivity;
import onlyup.crud.honeymoon.R;

public class ClientDetailsActivity extends AppCompatActivity implements View.OnClickListener {
    final Calendar myCalendar = Calendar.getInstance();
    EditText datePick, timePick;
    Button btnOrder,btnPaymentHistory,btnOrdersHistory,btnAccept;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_details);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        datePick= findViewById(R.id.datePick);
        timePick=findViewById(R.id.timePick);
        btnOrder=findViewById(R.id.btnOrder);
        btnPaymentHistory=findViewById(R.id.btnPaymentHistory);
        btnOrdersHistory=findViewById(R.id.btnOrdersHistory);
        btnAccept=findViewById(R.id.btnAccept);
        btnOrder.setOnClickListener(this);
        btnPaymentHistory.setOnClickListener(this);
        btnOrdersHistory.setOnClickListener(this);
        btnAccept.setOnClickListener(this);
        //Choosing Current Time
        timePick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar mcurrentTime = Calendar.getInstance();
                int hour = mcurrentTime.get(Calendar.HOUR_OF_DAY);
                int minute = mcurrentTime.get(Calendar.MINUTE);

                TimePickerDialog mTimePicker;
                mTimePicker = new TimePickerDialog(ClientDetailsActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {
                        timePick.setText( selectedHour + ":" + selectedMinute);
                    }
                }, hour, minute, true);
                mTimePicker.setTitle("Vaqtni tanlang");
                mTimePicker.show();
            }
        });



        //Choosing Current Date
        DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear,
                                  int dayOfMonth) {
                // TODO Auto-generated method stub
                myCalendar.set(Calendar.YEAR, year);
                myCalendar.set(Calendar.MONTH, monthOfYear);
                myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                updateLabel();
            }

        };

        datePick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                new DatePickerDialog(ClientDetailsActivity.this, date, myCalendar
                        .get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
                        myCalendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        });



    }


    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(this, MainActivity.class));
    }
    private void updateLabel() {
        String myFormat = "dd.MM.yyyy"; //In which you need put here
        SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);
        datePick.setText(sdf.format(myCalendar.getTime()));


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnPaymentHistory:
                startActivity(new Intent(getApplicationContext(),PaymentHistoryActivity.class));
                break;
            case R.id.btnOrdersHistory:
                startActivity(new Intent(getApplicationContext(),OrderHistoryActivity.class));
                break;
            case R.id.btnAccept:
                //startActivity(new Intent(getApplicationContext(),PaymentHistoryActivity.class));
                break;
            case R.id.btnOrder:
                startActivity(new Intent(getApplicationContext(),PaymentHistoryActivity.class));
                break;
        }
    }
}