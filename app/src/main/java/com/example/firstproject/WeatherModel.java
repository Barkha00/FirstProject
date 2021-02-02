package com.example.firstproject;

public class WeatherModel {

public WeatherModel(){
}

public void getData(onDataListener callBack){
    callBack.onSuccess("Successfully");
}

public interface onDataListener {
    void onSuccess(String success);


    void showSuccess(String display);

}

public void showData(onDataListener showBack){
    showBack.showSuccess("Display");


}
}
