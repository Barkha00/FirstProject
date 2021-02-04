package com.example.firstproject.MVP;

import com.example.firstproject.RetrofitHelper.APIClient;
import com.example.firstproject.RetrofitHelper.APIInterface;
import com.example.firstproject.RetrofitHelper.MultipleResource;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class WeatherModel {

    private APIInterface apiInterface;

    public WeatherModel() {
    }

//    public void getData(onDataListener callBack) {
//        callBack.onSuccess("Successfully");
//    }


    public void showData(Float lat, Float lon, String product, String output, onDataListener showBack) {

        apiInterface = APIClient.getClient().create(APIInterface.class);

        Call<MultipleResource> call = apiInterface.doGetListResources(lat,lon,product,output);
        call.enqueue(new Callback<MultipleResource>() {


            @Override
            public void onResponse(Call<MultipleResource> call, Response<MultipleResource> response) {
                if (response.isSuccessful()){
                    showBack.onSuccess(response.body());
                }
            }

            @Override
            public void onFailure(Call<MultipleResource> call, Throwable t) {
                showBack.onFailure("Unable to fetch");
            }
        });
    }



        public interface onDataListener {
            void onSuccess(MultipleResource success);


            void onFailure(String message);

        }
    }