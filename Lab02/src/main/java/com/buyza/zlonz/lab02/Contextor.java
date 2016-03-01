package com.buyza.zlonz.lab02;

import android.content.Context;

/**
 * Created by Zlonz on 1/3/2559.
 */
public class Contextor {
    private static Contextor instance;

    public static Contextor getInstance(){
        if(instance == null)
            instance = new Contextor();
        return instance;
    }

    private Context mContextor;

    private Contextor(){}

    public void init(Context context){
        mContextor = context;
    }

    public Context getContext(){
        return mContextor;
    }
}
