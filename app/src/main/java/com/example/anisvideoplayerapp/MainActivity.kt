package com.example.anisvideoplayerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val videoView : VideoView = findViewById(R.id.videoView)
        videoView.setVideoPath("android.resource://"
                                +packageName+"/"+R.raw.aggallio)
        val mediaController  = MediaController(this@MainActivity)
    }
}