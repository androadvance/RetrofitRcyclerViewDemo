package com.example.refrofitdemo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.POST;

public interface ApiInterface {

    @POST("readcontacts.php")
    Call<List<Contact>> getContact();
}
