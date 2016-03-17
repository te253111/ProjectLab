package com.example.zlonz.lab04.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.zlonz.lab04.R;

/**
 * Created by Zlonz on 17/3/2559.
 */
public class custum_viewgroup extends FrameLayout {

    ImageView img;
    TextView txtv;



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
        txtv = (TextView) findViewById(R.id.txtname);
        img = (ImageView) findViewById(R.id.img);
    }


    public ImageView getImg() {
        return img;
    }

    public void setTxtv(String name) {
        txtv.setText(name);
    }
}
