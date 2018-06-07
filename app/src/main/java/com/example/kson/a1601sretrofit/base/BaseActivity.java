package com.example.kson.a1601sretrofit.base;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.WindowManager;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Author:kson
 * E-mail:19655910@qq.com
 * Time:2018/06/07
 * Description:
 */
public abstract class BaseActivity extends AppCompatActivity {


    private final String TAG = BaseActivity.class.getSimpleName();
    protected Unbinder unbinder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(bindLayoutId());
        unbinder = ButterKnife.bind(this);//绑定butterknife
        initView();
        initData();
    }

    /**
     * 初始化数据
     */
    protected abstract void initData();

    /**
     * 初始化view
     */
    protected abstract void initView();

    /**
     * 根布局id
     * @return
     */
    protected abstract int bindLayoutId();

    /**
     * 显示toast
     * @param msg
     */
    public void showToast(String msg){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    /**
     * 无值传递跳转
     * @param cls
     */
    public void startActivity(Class<? extends Activity> cls){
        Intent intent = new Intent(this, cls);
        startActivity(intent);
    }
    /**
     * 有值传递跳转
     * @param cls
     */
    public void startActivity(Bundle bundle,Class<? extends Activity> cls){
        Intent intent = new Intent(this, cls);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    /**
     * 是否
     * @param flag
     */
    public void isFullScreen(boolean flag){

        if (flag){
            // TODO: 2018/6/7  全屏的代码
            getWindow().setFlags(
                    WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }else{
            // TODO: 2018/6/7 fei

        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (unbinder!=null){
            unbinder.unbind();//解绑
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG,"onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }
}
