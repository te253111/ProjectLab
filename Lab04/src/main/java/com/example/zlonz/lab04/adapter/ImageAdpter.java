package com.example.zlonz.lab04.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.bumptech.glide.Glide;
import com.example.zlonz.lab04.dao.DaoManager;
import com.example.zlonz.lab04.dao.memberdao;
import com.example.zlonz.lab04.view.custum_viewgroup;

/**
 * Created by Zlonz on 17/3/2559.
 */
public class ImageAdpter extends BaseAdapter {


    @Override
    public int getCount() {
        if(DaoManager.getInstance().getDao()==null)
            return 0;
        if(DaoManager.getInstance().getDao().getResults()==null)
            return 0;
        return DaoManager.getInstance().getDao().getResults().size();
    }

    @Override
    public Object getItem(int position) {
        return DaoManager.getInstance().getDao().getResults().get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        custum_viewgroup cv=null;
        if(convertView == null){
            cv = new custum_viewgroup(parent.getContext());
        }else{
            cv = (custum_viewgroup) convertView;
        }


        memberdao dao = (memberdao) getItem(position);
        Glide.with(parent.getContext())
                .load(dao.getUrl())
                .into(cv.getImg());
        cv.setTxtv(dao.getWho());
        return cv;
    }
}
