package com.example.testworkjson.data;

import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import com.example.testworkjson.MainActivity;
import com.example.testworkjson.R;
import com.example.testworkjson.models.DataEntity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitAdapter {

    TextView codeApiTextView, btcTextView;
    Button parseButton;

    public void RetrofitGet () {
        retrofit2.Retrofit retrofit = new retrofit2.Retrofit.Builder()
                .baseUrl("https://api.coingecko.com/api/v3/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiService apiService = retrofit.create(ApiService.class);
        Call<DataEntity> call = apiService.getDataEntity();

        call.enqueue(new Callback<DataEntity>() {
            @Override
            public void onResponse(Call<DataEntity> call, Response<DataEntity> response) {
                Log.d("Tag", "Server Resp " + response.toString());
                Log.d("Tag", "onResp " + response.body().toString());
                Double d = response.body().getData().getMarketCapPercentage().getBtc();
            }

            @Override
            public void onFailure(Call<DataEntity> call, Throwable t) {

            }
        });
    }
}
