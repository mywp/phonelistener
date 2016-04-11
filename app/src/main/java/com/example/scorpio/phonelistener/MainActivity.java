package com.example.scorpio.phonelistener;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void start(View view) {
        //开启服务
        Intent intent = new Intent(this,SystemService.class);
        startService(intent);
    }

    public void stop(View view) {
        //停止服务
        Intent intent = new Intent(this,SystemService.class);
        stopService(intent);
    }
}
