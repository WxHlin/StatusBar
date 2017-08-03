package com.example.xiongwei.statusbar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import org.zackratos.ultimatebar.UltimateBar;

/**
 * Created by xiongwei on 2017/8/3.
 */

public class BaseActivity extends AppCompatActivity{

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        UltimateBar ultimateBar = new UltimateBar(this);
        ultimateBar.setImmersionBar();


    }
}
