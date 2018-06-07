package com.example.kson.a1601sretrofit.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kson.a1601sretrofit.R;

import java.util.List;

/**
 * Author:kson
 * E-mail:19655910@qq.com
 * Time:2018/06/07
 * Description:
 */
public class ProductAdapter extends MyBaseAdapter {
    public ProductAdapter(List list, Context context) {
        super(list, context);
    }

    @Override
    protected View getItemView(View view) {
        TextView tv = view.findViewById(R.id.title_tv);
        ImageView icon = view.findViewById(R.id.icon_iv);
        tv.setText("kson");
        return view;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.product_item_layout;
    }
}
