package com.example.kson.a1601sretrofit.base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Author:kson
 * E-mail:19655910@qq.com
 * Time:2018/06/07
 * Description:
 */
public abstract class BaseFragment extends Fragment {

    protected View rootView;
    Unbinder unbinder;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (rootView==null){
            rootView = LayoutInflater.from(getContext()).inflate(bindLayoutid(),container,false);

            unbinder = ButterKnife.bind(this,rootView);
        }
        return rootView;
    }

    protected abstract int bindLayoutid();


    @Override
    public void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }
}
