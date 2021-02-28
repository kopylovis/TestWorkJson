package com.example.testworkjson.data;

import com.example.testworkjson.App;
import com.example.testworkjson.db.MarketCapPercentageDao;
import com.example.testworkjson.db.MarketCapPercentageDataBase;
import com.example.testworkjson.models.DataEntity;
import com.example.testworkjson.models.MarketCapPercentage;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitAdapter {
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
                MarketCapPercentageDataBase db = App.getInstance().getDataBase();
                MarketCapPercentageDao marketCapPercentageDao = db.marketCapPercentageDao();
                marketCapPercentageDao.insert(response.body().getData().getMarketCapPercentage());
            }

            @Override
            public void onFailure(Call<DataEntity> call, Throwable t) {

            }
        });
    }
}
