package com.example.testworkjson.db;

import android.content.Context;
import android.os.AsyncTask;
import android.telecom.Call;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.example.testworkjson.models.MarketCapPercentage;

@Database(entities = {MarketCapPercentage.class}, version = 1, exportSchema = false)
public abstract class MarketCapPercentageDataBase extends RoomDatabase {

    private static MarketCapPercentageDataBase INSTANCE;
    private static final String DATABASE_NAME = "marketcap_database";

    public abstract MarketCapPercentageDao marketCapPercentageDao();

    public synchronized static MarketCapPercentageDataBase getInstance(Context context) {
        if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                    MarketCapPercentageDataBase.class, DATABASE_NAME)
                    .allowMainThreadQueries()
                    .build();
        }
        return INSTANCE;
    }
}

