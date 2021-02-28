package com.example.testworkjson.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testworkjson.MainActivity;
import com.example.testworkjson.R;
import com.example.testworkjson.models.MarketCapPercentage;

import java.util.List;

public class MarketCapAdapter extends RecyclerView.Adapter<MarketCapViewHolder> {

    Context context;

    public MarketCapAdapter(MainActivity mainActivity) {

    }

    @NonNull
    @Override
    public MarketCapViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.market_cap_item, parent, false);
        return new MarketCapViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MarketCapViewHolder holder, int position) {
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
