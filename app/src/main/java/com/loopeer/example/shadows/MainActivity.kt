package com.loopeer.example.shadows

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onCardItemClick(view: View) {
        startActivity(Intent(this, CardViewActivity::class.java))
    }

    fun onShadowItemClick(view: View) {
        startActivity(Intent(this, ShadowViewActivity::class.java))
    }

    fun onShadowDemo2ItemClick(view: View) {
        startActivity(Intent(this, ShadowViewDemo2Activity::class.java))
    }
}
