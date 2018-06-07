package com.example.kson.a1601sretrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.kson.a1601sretrofit.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnLongClick;

public class MainActivity extends BaseActivity {

    @BindView(R.id.btn1)
    Button btn1;
    @BindView(R.id.btn2)
    Button btn2;

//    @OnLongClick()//长按事件

//    @OnClick(R.id.btn2)
//    public void bc(View view){
//        Toast.makeText(MainActivity.this, "我的按钮2", Toast.LENGTH_SHORT).show();
//
//    }

    @Override
    protected void initData() {
    }

    @Override
    protected void initView() {

    }

    @Override
    protected int bindLayoutId() {
        return R.layout.activity_main;
    }

    @OnClick({R.id.btn1, R.id.btn2})
    public void a(View view) {
        switch (view.getId()) {
            case R.id.btn1:
                showToast("btn1");
                break;
            case R.id.btn2:
                showToast("btn2");
                break;
        }
    }

}
