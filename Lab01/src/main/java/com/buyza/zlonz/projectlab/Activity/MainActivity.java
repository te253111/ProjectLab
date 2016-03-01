package com.buyza.zlonz.projectlab.Activity;

import android.content.res.Configuration;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.buyza.zlonz.projectlab.R;


public class MainActivity extends AppCompatActivity {
    TextView txt;
    Toolbar toolbar;
    DrawerLayout drawerlayout;
    Button btdrawer;
    ActionBarDrawerToggle actionBarDrawerToggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        txt = (TextView) findViewById(R.id.txt);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        drawerlayout = (DrawerLayout) findViewById(R.id.drawermenu);
        btdrawer = (Button) findViewById(R.id.btdrawer);
        setSupportActionBar(toolbar);


        actionBarDrawerToggle = new ActionBarDrawerToggle(
                MainActivity.this,
                drawerlayout,
                R.string.openmenu,
                R.string.closemenu
        );

        drawerlayout.addDrawerListener(actionBarDrawerToggle);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btdrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText("item4");
                drawerlayout.closeDrawers();
            }
        });
    }


    @Override
    public void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        actionBarDrawerToggle.syncState();
    }


    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        actionBarDrawerToggle.onConfigurationChanged(newConfig);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                txt.setText("item1");
                return true;
            case R.id.item2:
                txt.setText("item2");
                return true;
            case R.id.item3:
                txt.setText("item3");
                return true;
            default:
                if(actionBarDrawerToggle.onOptionsItemSelected(item)){
                    return true;
                }
                return super.onOptionsItemSelected(item);
        }
    }
}
