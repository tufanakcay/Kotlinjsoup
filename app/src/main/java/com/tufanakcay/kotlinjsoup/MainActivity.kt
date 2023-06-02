package com.tufanakcay.kotlinjsoup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val result = Result()
        val run = Runnable {
            val list = result.news()
            Log.d("title", list.get(0).href)
        }
        Thread(run).start()

    }

}