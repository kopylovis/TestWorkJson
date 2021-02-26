package com.example.testworkjson.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MarketCapPercentage {

    @SerializedName("btc")
    @Expose
    private Double btc;
    @SerializedName("eth")
    @Expose
    private Double eth;
    @SerializedName("ada")
    @Expose
    private Double ada;
    @SerializedName("bnb")
    @Expose
    private Double bnb;
    @SerializedName("usdt")
    @Expose
    private Double usdt;
    @SerializedName("dot")
    @Expose
    private Double dot;
    @SerializedName("xrp")
    @Expose
    private Double xrp;
    @SerializedName("ltc")
    @Expose
    private Double ltc;
    @SerializedName("link")
    @Expose
    private Double link;
    @SerializedName("bch")
    @Expose
    private Double bch;


    public Double getBtc() {
        return btc;
    }

    public void setBtc(Double btc) {
        this.btc = btc;
    }

    public Double getEth() {
        return eth;
    }

    public void setEth(Double eth) {
        this.eth = eth;
    }

    public Double getAda() {
        return ada;
    }

    public void setAda(Double ada) {
        this.ada = ada;
    }

    public Double getBnb() {
        return bnb;
    }

    public void setBnb(Double bnb) {
        this.bnb = bnb;
    }

    public Double getUsdt() {
        return usdt;
    }

    public void setUsdt(Double usdt) {
        this.usdt = usdt;
    }

    public Double getDot() {
        return dot;
    }

    public void setDot(Double dot) {
        this.dot = dot;
    }

    public Double getXrp() {
        return xrp;
    }

    public void setXrp(Double xrp) {
        this.xrp = xrp;
    }

    public Double getLtc() {
        return ltc;
    }

    public void setLtc(Double ltc) {
        this.ltc = ltc;
    }

    public Double getLink() {
        return link;
    }

    public void setLink(Double link) {
        this.link = link;
    }

    public Double getBch() {
        return bch;
    }

    public void setBch(Double bch) {
        this.bch = bch;
    }
}
