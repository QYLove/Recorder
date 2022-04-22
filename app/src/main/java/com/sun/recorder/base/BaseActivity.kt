package com.sun.recorder.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        initView();
        initData();
        setListener();
    }

    protected abstract fun getLayoutId(): Int;

    protected abstract fun initView();

    protected abstract fun initData();

    protected abstract fun setListener();
}