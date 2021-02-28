package com.example.testworkjson.db;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.testworkjson.models.DataEntity;
import com.example.testworkjson.models.MarketCapPercentage;

import java.util.List;

import retrofit2.Response;

@Dao
public interface MarketCapPercentageDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(MarketCapPercentage marketCapPercentage);

    @Query("SELECT * FROM marketcappercentage")
    MarketCapPercentage getAllMarketCapPercentage();

}
