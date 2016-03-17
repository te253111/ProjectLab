package com.example.zlonz.lab04.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.zlonz.lab04.R;

public class Main2Activity extends AppCompatActivity {
    ImageView img2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        img2 = (ImageView) findViewById(R.id.img2);
        String url= getIntent().getStringExtra("url");

        Glide.with(Main2Activity.this)
                .load(url)
                .into(img2);
    }
}
