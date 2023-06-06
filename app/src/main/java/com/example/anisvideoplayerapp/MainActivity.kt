package com.example.anisvideoplayerapp

import android.net.Uri
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
        mediaController.setAnchorView(videoView)
        mediaController.setMediaPlayer(videoView)
        videoView.setMediaController(mediaController)

        val secondVideoView : VideoView = findViewById(R.id.secondVideoView)
        val mediaController2  = MediaController(this@MainActivity)

        var uri : Uri = Uri.parse("https://youtu.be/dVtxHoSWlws")
        secondVideoView.setVideoURI(uri)
        mediaController2.setAnchorView(secondVideoView)
        mediaController2.setMediaPlayer(secondVideoView)
        secondVideoView.setMediaController(mediaController2)

    }
}