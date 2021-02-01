package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class WeatherActivity extends AppCompatActivity {

    Button  simpleButton;
    EditText fullname;
    EditText email;
    EditText phone;
    EditText address;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
       simpleButton=findViewById(R.id.simpleButton);
       fullname=findViewById(R.id.full_name);
       email=findViewById(R.id.email);
       phone=findViewById(R.id.phone);
       address=findViewById(R.id.address);



       simpleButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
             btn_nextPage();
           }
       });
    }

    public void btn_nextPage() {
        Intent intent = new Intent(WeatherActivity.this,WeatherDetailsActivity.class);
        intent.putExtra("full_name",fullname.getText().toString());
        intent.putExtra("email",email.getText().toString());
        intent.putExtra("phone",phone.getText().toString());
        intent.putExtra("address",address.getText().toString());
       startActivity(intent);





    }

}