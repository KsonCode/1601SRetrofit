package com.example.kson.a1601sretrofit.adapter;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kson.a1601sretrofit.R;
import com.example.kson.a1601sretrofit.bean.Product;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Author:kson
 * E-mail:19655910@qq.com
 * Time:2018/06/07
 * Description:
 */
public abstract class MyBaseAdapter<T> extends BaseAdapter {
    private List<T> list;
    private Context context;

    public MyBaseAdapter(List<T> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list == null ? 0 : list.size();
    }

    @Override
    public T getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

//        MyHolder myHolder = null;
        if (view == null) {
            view = LayoutInflater.from(context).inflate(getLayoutId(), viewGroup, false);
//            myHolder = new MyHolder(view);

//            view.setTag(myHolder);



        }
//        else {
//            myHolder = (MyHolder) view.getTag();
//        }

//        myHolder.titleTv.setText("title");

        return getItemView(view);
    }


    /**
     * 返回每个条目的view
     * @return
     */
    protected abstract View getItemView(View view);




    /**
     * 子类动态实现的布局id
     * @return
     */
    protected abstract int getLayoutId();

//    static class MyHolder {
//        @BindView(R.id.title_tv)
//        TextView titleTv;
//        @BindView(R.id.icon_iv)
//        ImageView iconIv;
//
//        public MyHolder(View view) {
//            ButterKnife.bind(this, view);
//        }
//    }

}
