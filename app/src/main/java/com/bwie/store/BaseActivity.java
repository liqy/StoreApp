package com.bwie.store;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

import com.bwie.store.crash.CrashHandler;

/**
 * 1. 类的用途
 * 2. @author：liqingyi
 * 3. @date：2017/2/22 19:53
 */

public class BaseActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        CrashHandler crashHandler=CrashHandler.getInstance();
        crashHandler.init(this);
    }

}
