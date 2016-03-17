package com.example.zlonz.lab04.dao;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Zlonz on 17/3/2559.
 */
public class membercollectiondao {
    @SerializedName("results") private List<memberdao> results;

    public List<memberdao> getResults() {
        return results;
    }

    public void setResults(List<memberdao> results) {
        this.results = results;
    }
}
