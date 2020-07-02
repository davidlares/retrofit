package com.davidlares.retrofit.services;

import com.davidlares.retrofit.model.DataItem;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public interface MyWebService {

    // http://560057.youcanlearnit.net/services/json/itemsfeed.php
    String BASE_URL = "https://jsonplaceholder.typicode.com/";
    String FEED = "posts";

    // Retrofit instance
    Retrofit retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create()).build();

    // GET Endpoint
    @GET(FEED)
    Call<List<DataItem>> dataItems();

}
