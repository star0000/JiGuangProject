package com.moyu.jiguangproject;

import android.app.Application;

import cn.jpush.android.api.JPushInterface;

/**
 * Created by 墨羽 on 2018/6/13.
 */

public class MyApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);
    }

}
