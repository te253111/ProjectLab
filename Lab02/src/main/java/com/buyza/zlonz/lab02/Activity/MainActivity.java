package com.buyza.zlonz.lab02.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.buyza.zlonz.lab02.R;
import com.buyza.zlonz.lab02.adapter.custum_adapter;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    custum_adapter custum_adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.listview);
        custum_adapter = new custum_adapter();
        lv.setAdapter(custum_adapter);
    }
}
