package com.example.testworkjson;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.RoomDatabase;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.testworkjson.data.RetrofitAdapter;
import com.example.testworkjson.db.MarketCapPercentageDao;
import com.example.testworkjson.db.MarketCapPercentageDataBase;
import com.example.testworkjson.models.MarketCapPercentage;
import com.example.testworkjson.recyclerview.MarketCapAdapter;

public class MainActivity extends AppCompatActivity {

    RetrofitAdapter retrofitAdapter = new RetrofitAdapter();
    RecyclerView recyclerView;
    MarketCapAdapter adapter;
    Button parseButton, showButton;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        retrofitAdapter.RetrofitGet();
        recyclerView = (RecyclerView) findViewById(R.id.amRecyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        adapter = new MarketCapAdapter(this);
        recyclerView.setAdapter(adapter);
    }
}