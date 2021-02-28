package com.example.testworkjson.recyclerview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testworkjson.R;
import com.example.testworkjson.models.MarketCapPercentage;

import java.util.ArrayList;
import java.util.List;

public class MarketCapAdapter extends RecyclerView.Adapter<MarketCapViewHolder> {

    Context context;
    List<MarketCapPercentage> marketCapPercentage;

    public MarketCapAdapter(Context context, List<MarketCapPercentage> marketCapPercentage) {
        this.context = context;
        this.marketCapPercentage = marketCapPercentage;
    }

    @NonNull
    @Override
    public MarketCapViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.market_cap_item, parent, false);
        return new MarketCapViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull MarketCapViewHolder holder, int position) {
        holder.btc.setText("btc: " + marketCapPercentage.get(position).getBtc().toString());
        holder.eth.setText("eth: " + marketCapPercentage.get(position).getEth().toString());
        holder.ada.setText("ada: " + marketCapPercentage.get(position).getAda().toString());
        holder.bnb.setText("bnb: " + marketCapPercentage.get(position).getBnb().toString());
        holder.usdt.setText("usdt: " + marketCapPercentage.get(position).getUsdt().toString());
        holder.dot.setText("dot: " + marketCapPercentage.get(position).getDot().toString());
        holder.xrp.setText("xrp: " + marketCapPercentage.get(position).getXrp().toString());
        holder.ltc.setText("ltc: " + marketCapPercentage.get(position).getLtc().toString());
        holder.link.setText("link: " + marketCapPercentage.get(position).getLink().toString());
        holder.xlm.setText("xlm: " + marketCapPercentage.get(position).getXlm().toString());
    }

    @Override
    public int getItemCount() {
        return marketCapPercentage.size();
    }
}
