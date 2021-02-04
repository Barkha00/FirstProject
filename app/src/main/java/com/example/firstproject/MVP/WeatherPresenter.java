package com.example.firstproject.MVP;

import com.example.firstproject.RetrofitHelper.MultipleResource;

//
public class WeatherPresenter implements WeatherInterface.Presenter {

    WeatherModel weatherModel;
    WeatherInterface.View view;




    public WeatherPresenter(WeatherInterface.View view){
        weatherModel=new WeatherModel();
        this.view=view;


    }


    @Override
    public void showTheData(float latitude, float longitude, String product, String output) {
        weatherModel.showData(latitude, longitude, product, output, new WeatherModel.onDataListener() {
            @Override
            public void onSuccess(MultipleResource success) {
                view.onSuccess(success);
            }

            @Override
            public void onFailure(String message) {
                view.onFail(message);
            }
        });
    }
}
