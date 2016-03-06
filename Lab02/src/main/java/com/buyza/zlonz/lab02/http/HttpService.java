package com.buyza.zlonz.lab02.http;

import android.content.Context;

import com.buyza.zlonz.lab02.Contextor;
import com.buyza.zlonz.lab02.dao.CustomerCollectionDao;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Zlonz on 5/3/2559.
 */
public class HttpService {
    private static HttpService instance;

    public static HttpService getInstance(){
        if(instance == null)
            instance = new HttpService();
        return instance;
    }

    private Context mContext;
    private ApiService service;
    private HttpService(){
        mContext = Contextor.getInstance().getContext();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://www.w3schools.com/angular/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        service = retrofit.create(ApiService.class);
    }


    public ApiService getService() {
        return service;
    }
}
