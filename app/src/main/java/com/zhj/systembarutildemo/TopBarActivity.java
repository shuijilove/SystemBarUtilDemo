package com.zhj.systembarutildemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by hjzhang on 2016/8/3.
 */
public class TopBarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StatusBarUtil.setStatusBarColor(this,getResources().getColor(R.color.colorPrimary),112);
        setContentView(R.layout.ac_bar_layout);
    }
}
