package com.bwie.store;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getAdvertItems();
    }

    private void getAdvertItems() {

        RequestParams params = new RequestParams("http://service.alinq.cn:2800/UserServices/Site/Home/GetAdvertItems?storeId=58401d1906c02a2b8877bd13");

        params.setConnectTimeout(1000 * 60);
        params.setHeader("application-token","58424776034ff82470d06d3d");
        params.setHeader("user-token","584cfabb4918e4186a77ff1e");

        params.setHeader("User-Agent","Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/56.0.2924.87 Mobile Safari/537.36");

        x.http().get(params, new Callback.CommonCallback<String>() {
            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onSuccess(String result) {
                Log.d(getLocalClassName(),result);
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
                Log.d(getLocalClassName(),"onError");
            }

            @Override
            public void onFinished() {
                Log.d(getLocalClassName(),"onError");
            }
        });

    }


}
