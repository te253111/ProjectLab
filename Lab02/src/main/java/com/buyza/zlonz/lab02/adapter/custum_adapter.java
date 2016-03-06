package com.buyza.zlonz.lab02.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.buyza.zlonz.lab02.View.custum_viewgroup;
import com.buyza.zlonz.lab02.dao.CustomerDao;
import com.buyza.zlonz.lab02.dao.DaoManager;

/**
 * Created by Zlonz on 5/3/2559.
 */
public class custum_adapter extends BaseAdapter {
    @Override
    public int getCount() {
        if(DaoManager.getInstance().getDao()==null)
            return 0;
        if(DaoManager.getInstance().getDao().getRecords()==null)
            return 0;
        return DaoManager.getInstance().getDao().getRecords().size();
    }

    @Override
    public Object getItem(int position) {
        return DaoManager.getInstance().getDao().getRecords().get(position);
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

        CustomerDao dao = (CustomerDao) getItem(position);
        cg.setCus_name(dao.getName());
        cg.setCus_city(dao.getCity());
        cg.setCus_country(dao.getCountry());
        return cg;
    }
}
