package com.buyza.zlonz.lab02.dao;

import android.content.Context;

import com.buyza.zlonz.lab02.Contextor;
import com.buyza.zlonz.lab02.http.ApiService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Zlonz on 5/3/2559.
 */
public class DaoManager {
    private static DaoManager instance;

    public static DaoManager getInstance(){
        if(instance == null)
            instance = new DaoManager();
        return instance;
    }

    private Context mContext;
    private CustomerCollectionDao dao;
    private DaoManager(){
        mContext = Contextor.getInstance().getContext();
    }


    public CustomerCollectionDao getDao() {
        return dao;
    }

    public void setDao(CustomerCollectionDao dao) {
        this.dao = dao;
    }
}
