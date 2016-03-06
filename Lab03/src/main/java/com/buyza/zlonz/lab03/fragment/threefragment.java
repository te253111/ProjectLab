package com.buyza.zlonz.lab03.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.buyza.zlonz.lab03.R;

/**
 * Created by Zlonz on 6/3/2559.
 */
public class threefragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.threefragment,container,false);
        return rootview;
    }
}
