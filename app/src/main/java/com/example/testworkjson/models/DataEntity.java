package com.example.testworkjson.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DataEntity {

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @SerializedName("data")
    @Expose
    private Data data;
}
