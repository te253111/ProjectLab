package com.buyza.zlonz.lab02.dao;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Zlonz on 5/3/2559.
 */
public class CustomerDao {
    @SerializedName("Name") private String name;
    @SerializedName("City") private String city;
    @SerializedName("Country") private String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
