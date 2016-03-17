package com.example.zlonz.lab04.http;

import android.content.Context;


import com.example.zlonz.lab04.Contextor;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

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
                .baseUrl("https://gank.io")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        service = retrofit.create(ApiService.class);
    }


    public ApiService getService() {
        return service;
    }
}
