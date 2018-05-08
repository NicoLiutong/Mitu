package com.nico.mitu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import cn.bmob.v3.Bmob;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);
        //第一：默认初始化
        Bmob.initialize(this, "98ce4647ab0b9e9c65aefdbb37d27962");

    }
}
