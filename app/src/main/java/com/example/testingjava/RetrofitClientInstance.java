package com.example.testingjava;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
public class RetrofitClientInstance {
    private static String JSONURL = "https://simplifiedcoding.net/demos/";
    private static Retrofit retrofit;
    public static Retrofit getRetrofitInstance()
    {
        if(retrofit == null)
        {
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(JSONURL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
