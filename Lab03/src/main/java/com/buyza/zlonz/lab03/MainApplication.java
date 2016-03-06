package com.buyza.zlonz.lab03;

import android.app.Application;

/**
 * Created by Zlonz on 6/3/2559.
 */
public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Contextor.getInstance().init(getApplicationContext());
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
