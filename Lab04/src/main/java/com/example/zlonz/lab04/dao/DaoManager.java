package com.example.zlonz.lab04.dao;

import android.content.Context;

import com.example.zlonz.lab04.Contextor;


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
    private membercollectiondao dao;
    private DaoManager(){
        mContext = Contextor.getInstance().getContext();
    }


    public membercollectiondao getDao() {
        return dao;
    }

    public void setDao(membercollectiondao dao) {
        this.dao = dao;
    }
}
