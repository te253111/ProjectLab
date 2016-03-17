package com.example.zlonz.lab04.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.Toast;

import com.example.zlonz.lab04.R;
import com.example.zlonz.lab04.adapter.ImageAdpter;
import com.example.zlonz.lab04.dao.DaoManager;
import com.example.zlonz.lab04.dao.membercollectiondao;
import com.example.zlonz.lab04.http.HttpService;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    GridView gv;
    ImageAdpter ia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ia = new ImageAdpter();
        gv = (GridView) findViewById(R.id.gridview);
        gv.setAdapter(ia);

        Call<membercollectiondao> call = HttpService.getInstance().getService().loadcustomer();
        call.enqueue(new Callback<membercollectiondao>() {
            @Override
            public void onResponse(Call<membercollectiondao> call, Response<membercollectiondao> response) {
                if(response.isSuccess()){
                    membercollectiondao dao = response.body();
                    DaoManager.getInstance().setDao(dao);
                    ia.notifyDataSetChanged();
                }else{
                    try {
                        Toast.makeText(MainActivity.this,response.errorBody().string(),Toast.LENGTH_SHORT).show();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void onFailure(Call<membercollectiondao> call, Throwable t) {
                Toast.makeText(MainActivity.this,t.toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
