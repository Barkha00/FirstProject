package com.example.firstproject;

public interface WeatherInterface {

    //creating Presenter interface to connect the method from view and to send to presenter.
    interface Presenter{


        void requestDataFromServer();

        void showTheData();

    }
    //
    interface View{
        void setWeather();

        void onSuccessData(String onsuccess);


        void onShowData(String display);
    }


}
