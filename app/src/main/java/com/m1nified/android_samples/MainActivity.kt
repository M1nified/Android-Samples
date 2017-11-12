package com.m1nified.android_samples

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buttonOnClick(v: View){
        Log.d(this.javaClass.name.toString(), "BUTTON CLICK XML")
    }
}
