package com.example.testworkjson.data;

import com.example.testworkjson.models.DataEntity;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("global")
    Call<DataEntity> getDataEntity();
}
