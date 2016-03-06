package com.buyza.zlonz.lab03.activity;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.buyza.zlonz.lab03.R;
import com.buyza.zlonz.lab03.fragment.onefragment;
import com.buyza.zlonz.lab03.fragment.threefragment;
import com.buyza.zlonz.lab03.fragment.twofragment;

public class MainActivity extends AppCompatActivity {
    TabLayout tab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setFragmennt(new onefragment());

        init();
    }

    private void setFragmennt(Fragment fr){
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.ContenContainer,fr)
                .commit();
    }

    private void init() {
        tab = (TabLayout) findViewById(R.id.tabs);
        tab.addTab(tab.newTab().setText("One").setIcon(R.mipmap.ic_launcher));
        tab.addTab(tab.newTab().setText("Two").setIcon(R.mipmap.ic_launcher));
        tab.addTab(tab.newTab().setText("Three").setIcon(R.mipmap.ic_launcher));
        tab.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition()){
                    case 0:
                        setFragmennt(new onefragment());
                        break;
                    case 1:
                        setFragmennt(new twofragment());
                        break;
                    case 2:
                        setFragmennt(new threefragment());
                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }


}
