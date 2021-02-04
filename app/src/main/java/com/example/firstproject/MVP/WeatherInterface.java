package com.example.firstproject.MVP;

import com.example.firstproject.RetrofitHelper.MultipleResource;

public interface WeatherInterface {

    //creating Presenter interface to connect the method from view and to send to presenter.
    interface Presenter{



        void showTheData(float latitude,float longitude,String product, String output);

    }
    //
    interface View{
       void onSuccess(MultipleResource multipleResource);

       void onFail(String errormessage);
    }


}
