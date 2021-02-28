package com.example.testworkjson;

import android.app.Application;

import androidx.room.Room;

import com.example.testworkjson.db.MarketCapPercentageDataBase;

public class App extends Application {
    public static App instance;
    private MarketCapPercentageDataBase dataBase;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        dataBase = Room.databaseBuilder(this, MarketCapPercentageDataBase.class, "database")
                .allowMainThreadQueries()
                .build();
    }

    public static App getInstance() {
        return instance;
    }

    public MarketCapPercentageDataBase getDataBase() {
        return dataBase;
    }
}
