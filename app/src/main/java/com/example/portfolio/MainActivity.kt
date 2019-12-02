package com.example.portfolio

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity;
import android.util.Log
import android.view.View

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun handleMusicButton(v: View) {

    }

    fun handleArtButton(v: View) {
        Log.d("WERNER","art button clicked")
        val intent = Intent(this, Art::class.java)
        startActivity(intent)
    }

    fun handleDesignButton(v: View) {

    }

    fun handlePhotosButton(v: View) {

    }
}
