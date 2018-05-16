package com.dreamwalker.filesysyem101

import android.os.Bundle
import android.os.Environment
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var envPath = Environment.getDataDirectory().toString()
        print("getDataDirectory : ")
        println(envPath)
        envPath = Environment.getDownloadCacheDirectory().toString()
        print("getDownloadCacheDirectory : ")
        println(envPath)
        envPath = Environment.getRootDirectory().toString()
        print("getRootDirectory : ")
        println(envPath)
        envPath = Environment.getExternalStorageDirectory().toString()
        print("getExternalStorageDirectory : ")
        println(envPath)
        envPath = Environment.getExternalStorageState().toString()
        print("getExternalStorageState : ")
        println(envPath)

    }
}
