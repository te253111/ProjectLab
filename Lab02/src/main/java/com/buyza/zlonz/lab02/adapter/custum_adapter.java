package com.buyza.zlonz.lab02.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.buyza.zlonz.lab02.View.custum_viewgroup;

/**
 * Created by Zlonz on 5/3/2559.
 */
public class custum_adapter extends BaseAdapter {
    @Override
    public int getCount() {
        return 10000;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        custum_viewgroup cg = null;
        if(convertView !=null){
            cg = (custum_viewgroup) convertView;
        }else{
            cg = new custum_viewgroup(parent.getContext());
        }
        return cg;
    }
}
