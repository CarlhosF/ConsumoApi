package com.example.message.model;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface MessegeAPI {
    @GET("/api/v1/employees/{id}")
    public Call<Messege> find(@Path("id") String id );
}
