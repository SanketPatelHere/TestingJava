package com.example.testingjava;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
public interface GetDataService {
    @GET("marvel")
    Call<List<Hero>>  getHeroes();
}
