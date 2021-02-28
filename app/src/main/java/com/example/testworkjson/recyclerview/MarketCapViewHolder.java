package com.example.testworkjson.recyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testworkjson.R;

public class MarketCapViewHolder extends RecyclerView.ViewHolder {


    TextView btc, eth, ada, bnb, usdt, dot, xrp, ltc, link, xlm;

    public MarketCapViewHolder(@NonNull View itemView) {
        super(itemView);
        btc = itemView.findViewById(R.id.mciBtc);
        eth = itemView.findViewById(R.id.mciEth);
        ada = itemView.findViewById(R.id.mciAda);
        bnb = itemView.findViewById(R.id.mciBnb);
        usdt = itemView.findViewById(R.id.mciUsdt);
        dot = itemView.findViewById(R.id.mciDot);
        xrp = itemView.findViewById(R.id.mciXrp);
        ltc = itemView.findViewById(R.id.mciLtc);
        link = itemView.findViewById(R.id.mciLink);
        xlm = itemView.findViewById(R.id.mciXlm);
    }
}
