package com.jane.xjutils;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ActivityManager;
import android.os.Bundle;

import com.jane.utils.android.LogUtils;

public class MainActivity extends AppCompatActivity {

    String json = "[{\"user\":1},{\"user\":1}]";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LogUtils.e(json, "https://www.baidu.com");
    }
}