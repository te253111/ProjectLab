package com.example.zlonz.lab04.http;

import com.example.zlonz.lab04.dao.membercollectiondao;

import retrofit2.Call;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by Zlonz on 5/3/2559.
 */
public interface ApiService {
    @GET("/api/data/福利/50/1")
    Call<membercollectiondao>loadcustomer();
}
