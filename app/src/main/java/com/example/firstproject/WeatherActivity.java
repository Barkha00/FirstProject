package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class WeatherActivity extends AppCompatActivity implements WeatherInterface.View {
// define
    Button  simpleButton;
    EditText fullname;
    EditText email;
    EditText phone;
    EditText address;
    WeatherInterface.Presenter presenter;


    public void display(){

    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //mapping
        setContentView(R.layout.activity_weather);
       simpleButton=findViewById(R.id.simpleButton);
       fullname=findViewById(R.id.full_name);
       email=findViewById(R.id.email);
       phone=findViewById(R.id.phone);
       address=findViewById(R.id.address);
      presenter= new WeatherPresenter(this);






       simpleButton.setOnClickListener(new View.OnClickListener() {
           @Override
           //button onclick
           public void onClick(View v) {

               if (fullname.getText().toString().length() == 0) {
                   Toast.makeText(getApplicationContext(), "Please input number", Toast.LENGTH_LONG).show();
                   fullname.setError("Please enter name");
               }
               else if (email.getText().toString().length()==0){
                   Toast.makeText(getApplicationContext(), "Enter your Email",Toast.LENGTH_LONG).show();
                   email.setError("Please enter email");
               }
               else if (phone.getText().toString().length()==0){
                   Toast.makeText(getApplicationContext(), "Enter your number",Toast.LENGTH_LONG).show();
                   phone.setError("Please enter phone no");

               }
               else if (address.getText().toString().length()==0){
                   Toast.makeText(getApplicationContext(),"Enter your address", Toast.LENGTH_LONG).show();
                   address.setError("Please enter address");

               }

               else {
                   //request sent
                   //presenter.requestDataFromServer();
                   presenter.showTheData();
                   btn_nextPage();

               }



           }

           
       });
    }
// function
    public void btn_nextPage() {
        Intent intent = new Intent(WeatherActivity.this,WeatherDetailsActivity.class);
        intent.putExtra("full_name",fullname.getText().toString());
        intent.putExtra("email",email.getText().toString());
        intent.putExtra("phone",phone.getText().toString());
        intent.putExtra("address",address.getText().toString());

       startActivity(intent);







    }


    @Override
    public void setWeather() {

    }

    @Override
    public void onSuccessData(String onsuccess) {
        Toast.makeText(getApplicationContext(),onsuccess,Toast.LENGTH_LONG).show();
    }

    @Override
    public void onShowData(String display) {
        Toast.makeText(getApplicationContext(),display,Toast.LENGTH_LONG).show();

    }



}