package com.buyza.zlonz.lab02.View;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.buyza.zlonz.lab02.R;

import java.util.zip.Inflater;

/**
 * Created by Zlonz on 5/3/2559.
 */
public class custum_viewgroup extends FrameLayout{

    private TextView cus_name;
    private TextView cus_city;
    private TextView cus_country;


    public custum_viewgroup(Context context) {
        super(context);
        init();
    }

    public custum_viewgroup(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public custum_viewgroup(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @TargetApi(21)
    public custum_viewgroup(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.custum_viewgroup,this);
        cus_name = (TextView) findViewById(R.id.cus_name);
        cus_city = (TextView) findViewById(R.id.cus_city);
        cus_country = (TextView) findViewById(R.id.cus_country);
    }

    public void setCus_name(String name) {
        this.cus_name.setText(name);
    }

    public void setCus_city(String name) {
        this.cus_city.setText(name);
    }

    public void setCus_country(String name) {
        this.cus_country.setText(name);
    }
}
