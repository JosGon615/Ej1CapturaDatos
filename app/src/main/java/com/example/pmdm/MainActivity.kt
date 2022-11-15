 package com.example.pmdm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private var onCreate = 0
    private var onStart = 0
    private var onResume = 0
    private var onPause = 0
    private var onRestart = 0
    private var onStop = 0
    private var onDestroy = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println(onCreate)
        println(onStart)
        println(onResume)
        println(onPause)
        println(onRestart)
        println(onStop)
        println(onDestroy)

    }
}