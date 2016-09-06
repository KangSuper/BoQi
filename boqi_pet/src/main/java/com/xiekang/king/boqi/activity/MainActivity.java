package com.xiekang.king.boqi.activity;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.xiekang.king.boqi.R;

public class MainActivity extends AppCompatActivity {

    private FragmentManager supportFragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFragment();
    }

    private void initFragment() {
        supportFragmentManager = getSupportFragmentManager();
    }
}
