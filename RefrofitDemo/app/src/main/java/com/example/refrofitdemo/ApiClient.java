package com.example.refrofitdemo;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    public static final String Base_Url = "http://10.0.2.2/contactapp/";
    public static Retrofit retrofit = null;

    public static Retrofit getApiClient(){

        if (retrofit == null){
            retrofit = new Retrofit.Builder().baseUrl(Base_Url).
                    addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
