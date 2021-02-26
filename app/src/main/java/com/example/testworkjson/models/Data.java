package com.example.testworkjson.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @Expose
    @SerializedName("market_cap_percentage")
    private MarketCapPercentage marketCapPercentage;

    public MarketCapPercentage getMarketCapPercentage() {
        return marketCapPercentage;
    }

    public void setMarketCapPercentage(MarketCapPercentage marketCapPercentage) {
        this.marketCapPercentage = marketCapPercentage;
    }
}
