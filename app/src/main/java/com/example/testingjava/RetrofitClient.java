package com.example.testingjava;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private static final String ROOT_URL = "http://pratikbutani.x10.mx";
    private static Retrofit getRetrofitInstance()
    {
        return new Retrofit.Builder()
                .baseUrl(ROOT_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
    public static ApiService getApiService()
    {
        return getRetrofitInstance().create(ApiService.class);
    }
}
