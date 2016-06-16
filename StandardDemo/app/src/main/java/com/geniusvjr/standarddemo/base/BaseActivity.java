package com.geniusvjr.standarddemo.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by dream on 16/6/16.
 */
public abstract class BaseActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    public void init() {
        setContentView();
        findViews();
        getData();
        showContent();
    }
    protected abstract void setContentView();

    protected abstract void findViews();

    protected abstract void getData();

    protected abstract void showContent();







    
}
