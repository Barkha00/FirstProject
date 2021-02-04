package com.example.firstproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.firstproject.MVP.WeatherInterface;
import com.example.firstproject.MVP.WeatherPresenter;
import com.example.firstproject.RetrofitHelper.MultipleResource;

public class WeatherActivity extends AppCompatActivity implements WeatherInterface.View {
// define
    Button  simpleButton;
    EditText latitude;
    EditText longitude;
    EditText product;
    EditText output;
    WeatherInterface.Presenter presenter;
    //global varibale
    String namenew;


    public void display(){

    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //mapping
        setContentView(R.layout.activity_weather);
       simpleButton=findViewById(R.id.simpleButton);
       latitude=findViewById(R.id.latitude);
       longitude=findViewById(R.id.longitude);
       product=findViewById(R.id.product);
       output=findViewById(R.id.output);

      presenter= new WeatherPresenter(this);






       simpleButton.setOnClickListener(new View.OnClickListener() {
           @Override
           //button onclick
           public void onClick(View v) {

               if (latitude.getText().toString().length() == 0) {
                   Toast.makeText(getApplicationContext(), "Please input number", Toast.LENGTH_LONG).show();
                   latitude.setError("Please enter name");
               }
               else if (longitude.getText().toString().length()==0){
                   Toast.makeText(getApplicationContext(), "Enter your Email",Toast.LENGTH_LONG).show();
                   longitude.setError("Please enter email");
               }
               else if (product.getText().toString().length()==0){
                   Toast.makeText(getApplicationContext(), "Enter your number",Toast.LENGTH_LONG).show();
                   product.setError("Please enter phone no");

               }
               else if (output.getText().toString().length()==0){
                   Toast.makeText(getApplicationContext(),"Enter your address", Toast.LENGTH_LONG).show();
                   output.setError("Please enter address");

               }

               else {
                   //request sent
                   //presenter.requestDataFromServer();
                   presenter.showTheData(Float.parseFloat(latitude.getText().toString()), Float.parseFloat(longitude.getText().toString()),product.getText().toString(),output.getText().toString());
                   btn_nextPage();

               }



           }

           
       });
    }
// function
    public void btn_nextPage() {




    }


    @Override
    public void onSuccess(MultipleResource multipleResource) {
        Intent intent = new Intent(WeatherActivity.this,WeatherDetailsActivity.class);
        intent.putExtra("latitude",latitude.getText().toString());
        intent.putExtra("longitude",longitude.getText().toString());
        intent.putExtra("product",product.getText().toString());
        intent.putExtra("output",output.getText().toString());
       // intent.putExtra("display",multipleResource.getProduct());

        startActivity(intent);

    }

    @Override
    public void onFail(String errormessage) {
        Toast.makeText(getApplicationContext(),errormessage,Toast.LENGTH_LONG).show();
    }
}