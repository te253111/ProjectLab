package com.buyza.zlonz.lab02.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.buyza.zlonz.lab02.R;
import com.buyza.zlonz.lab02.adapter.custum_adapter;
import com.buyza.zlonz.lab02.dao.CustomerCollectionDao;
import com.buyza.zlonz.lab02.dao.DaoManager;
import com.buyza.zlonz.lab02.http.HttpService;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    custum_adapter custum_adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        lv = (ListView) findViewById(R.id.listview);
        custum_adapter = new custum_adapter();
        lv.setAdapter(custum_adapter);
        Call<CustomerCollectionDao> call = HttpService.getInstance().getService().loadcustomer();
        call.enqueue(new Callback<CustomerCollectionDao>() {
            @Override
            public void onResponse(Call<CustomerCollectionDao> call, Response<CustomerCollectionDao> response) {
                if(response.isSuccess()){
                    CustomerCollectionDao dao = response.body();
                    DaoManager.getInstance().setDao(dao);
                    custum_adapter.notifyDataSetChanged();
                }else{
                    try {
                        Toast.makeText(MainActivity.this,response.errorBody().string(),Toast.LENGTH_SHORT).show();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void onFailure(Call<CustomerCollectionDao> call, Throwable t) {
                Toast.makeText(MainActivity.this,t.toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
