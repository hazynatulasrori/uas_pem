package com.example.kawalcorona;

import com.example.kawalcorona.Model.ModelDataInd;
import com.example.kawalcorona.Model.ModelObj;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Service {
    @GET("indonesia")
    Call<List<ModelDataInd>> getData();

    @GET("indonesia/provinsi")
    Call<List<ModelObj>>
}
