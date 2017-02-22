package com.bwie.store;

import android.app.Application;

import org.xutils.x;

/**
 * 1. 类的用途
 * 2. @author：liqingyi
 * 3. @date：2017/2/20 21:15
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
    }
}
