package com.example.xiongwei.statusbar;

import android.graphics.ImageFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.zackratos.ultimatebar.UltimateBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UltimateBar ultimateBar = new UltimateBar(this);

        // 1.自定义颜色的状态栏和导航栏
        //参数1：颜色值
        //参数2：颜色的深度值0——255之间，为0时就是第一个参数的颜色值，不为0时计算最总值
        // ultimateBar.setColorBar(ContextCompat.getColor(this, R.color.colorAccent), 50);

        // 2.半透明状态栏和导航栏
        //参数1：颜色值
        //参数2：透明度0——255之间   0表示不透明，255表示完全透明
       // ultimateBar.setTransparentBar(Color.RED, 50);

      // 3.沉浸式状态栏和导航栏
        ultimateBar.setImmersionBar();

        // 4.隐藏状态栏和导航栏:在 onWindowFocusChanged() 方法

        //5.在 DrawerLayout 中设置自定义颜色的状态栏和导航栏
       // 第一步：首先需要设置 DrawerLayout 下面的主局部中添加 android:fitsSystemWindows="true"
//        注意是 DrawerLayout 下面的主布局，DrawerLayout 本身和抽屉布局都不能添加。
        //第二步：UltimateBar ultimateBar = new UltimateBar(this);
//                ultimateBar.setColorBarForDrawer(ContextCompat.getColor(this, R.color.DeepSkyBlue), 50);
//                参数1：颜色值
//                参数2：不透明度

    }


    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus){
            //隐藏状态栏和导航栏
            UltimateBar ultimateBar = new UltimateBar(this);
            ultimateBar.setHintBar();
        }
    }
}
