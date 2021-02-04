package com.example.firstproject.RetrofitHelper;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIClient {

    private static Retrofit retrofit = null;

    public static Retrofit getClient() {



        retrofit = new Retrofit.Builder()
                .baseUrl("http://www.7timer.info/bin/api.pl/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();



        return retrofit;
    }

}