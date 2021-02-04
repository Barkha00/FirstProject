package com.example.firstproject.RetrofitHelper;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIInterface {

    @GET("/")
    Call<MultipleResource> doGetListResources(@Query("lat") Float lat,@Query("lon")Float lon,@Query("product")String product,@Query("output")String output);






}
