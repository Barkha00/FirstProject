package com.example.firstproject.MVP;

public class WeatherModel {

public WeatherModel(){
}

public void getData(onDataListener callBack){
    callBack.onSuccess("Successfully");
}


public void showData(onDataListener showBack){
    showBack.showSuccess("Display");


}

    public interface onDataListener {
        void onSuccess(String success);


        void showSuccess(String display);

    }

}
