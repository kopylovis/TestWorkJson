package com.example.testworkjson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.testworkjson.data.RetrofitAdapter;

public class MainActivity extends AppCompatActivity {

    RetrofitAdapter retrofitAdapter = new RetrofitAdapter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        retrofitAdapter.RetrofitGet();
    }
}