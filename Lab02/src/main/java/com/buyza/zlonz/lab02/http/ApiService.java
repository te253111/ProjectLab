package com.buyza.zlonz.lab02.http;

import com.buyza.zlonz.lab02.dao.CustomerCollectionDao;

import retrofit2.Call;
import retrofit2.http.POST;

/**
 * Created by Zlonz on 5/3/2559.
 */
public interface ApiService {
    @POST("customers.php")
    Call<CustomerCollectionDao> loadcustomer();
}
