package com.example.testworkjson;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.RoomDatabase;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.testworkjson.data.RetrofitAdapter;
import com.example.testworkjson.db.MarketCapPercentageDao;
import com.example.testworkjson.db.MarketCapPercentageDataBase;
import com.example.testworkjson.models.MarketCapPercentage;
import com.example.testworkjson.recyclerview.MarketCapAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RetrofitAdapter retrofitAdapter = new RetrofitAdapter();
    RecyclerView recyclerView;
    MarketCapAdapter adapter;
    Button parseButton, showButton;
    TextView btc, eth, ada;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.amRecyclerView);
        parseButton = findViewById(R.id.amButtonParse);
        showButton = findViewById(R.id.amButtonShow);
        btc = findViewById(R.id.mciBtc);
        eth = findViewById(R.id.mciEth);
        ada = findViewById(R.id.mciAda);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        parseButton.setOnClickListener((View v) -> {
            retrofitAdapter.RetrofitGet();
            Toast.makeText(this, "Parse done", Toast.LENGTH_SHORT).show();
        });
        showButton.setOnClickListener((View v) -> {
            MarketCapPercentageDataBase db = App.getInstance().getDataBase();
            MarketCapPercentageDao marketCapPercentageDao = db.marketCapPercentageDao();
            marketCapPercentageDao.getAllMarketCapPercentage();
            List<MarketCapPercentage> list = new ArrayList<>();
            list.add(marketCapPercentageDao.getAllMarketCapPercentage());
            list.size();
            adapter = new MarketCapAdapter(getApplicationContext(), list);
            recyclerView.setAdapter(adapter);
            Toast.makeText(this, "Show", Toast.LENGTH_SHORT).show();
        });
    }
}