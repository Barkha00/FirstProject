package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class WeatherDetailsActivity extends AppCompatActivity {

    TextView full_name;
    TextView email;
    TextView phone;
    TextView address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather_details);
        full_name=findViewById(R.id.full_name);
        email=findViewById(R.id.email);
        phone=findViewById(R.id.phone);
        address=findViewById(R.id.address);

        String name=getIntent().getStringExtra("full_name");
        full_name.setText(name);

        String Finalemail=getIntent().getStringExtra("email");
        email.setText(Finalemail);

        String number=getIntent().getStringExtra("phone");
        phone.setText(number);

        String place=getIntent().getStringExtra("address");
        address.setText(place);



    }


}