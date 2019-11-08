package com.example.testingjava;
import retrofit2.Call;
import retrofit2.http.GET;
public interface ApiService {

    @GET("/json_data.json")
    Call<ContactList> getMyJson();
}
