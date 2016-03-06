package com.buyza.zlonz.lab02.dao;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Zlonz on 5/3/2559.
 */
public class CustomerCollectionDao {
    @SerializedName("records") private List<CustomerDao>records;

    public List<CustomerDao> getRecords() {
        return records;
    }

    public void setRecords(List<CustomerDao> records) {
        this.records = records;
    }
}
