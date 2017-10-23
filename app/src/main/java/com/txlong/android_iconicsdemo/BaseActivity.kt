package com.txlong.android_iconicsdemo

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.support.v4.view.LayoutInflaterCompat
import android.support.v7.app.AppCompatActivity
import com.mikepenz.iconics.context.IconicsLayoutInflater
import com.mikepenz.iconics.context.IconicsLayoutInflater2

@SuppressLint("Registered")
open class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            LayoutInflaterCompat.setFactory2(layoutInflater, IconicsLayoutInflater2(delegate));
        } else {
            LayoutInflaterCompat.setFactory(layoutInflater, IconicsLayoutInflater(delegate))
        }
        super.onCreate(savedInstanceState)
    }
}