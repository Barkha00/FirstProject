package com.example.firstproject;

//
public class WeatherPresenter implements WeatherInterface.Presenter{

    WeatherModel weatherModel;
    WeatherInterface.View view;




    public WeatherPresenter(WeatherInterface.View view){
        weatherModel=new WeatherModel();
        this.view=view;


    }


    @Override
    public void requestDataFromServer() {
        weatherModel.getData(new WeatherModel.onDataListener() {
            @Override
            public void onSuccess(String success) {
                view.onSuccessData(success);
            }

            @Override
            public void showSuccess(String display) {
                 view.onShowData(display);


            }
        });


    }

    @Override
    public void showTheData() {

      weatherModel.showData(new WeatherModel.onDataListener() {
          @Override
          public void onSuccess(String success) {

          }

          @Override
          public void showSuccess(String display) {
              view.onShowData(display);

          }
      });

    }
}
