package com.example.service

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //button facebook jika diklik menampilkan halaman facebook.com
        btn_facebook.setOnClickListener({
            val i = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("http://www.facebook.com/langitinspirasi")
            )
            startActivity(i)
        })

        //button instagram jika diklik menampilkan halaman instagram.com
        btn_instagram.setOnClickListener({
            val i = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("http://www.instagram.com/langitinspirasi.co.id")
            )
            startActivity(i)
        })

        //mendeklarasikan variabel MediaPlayer dan memanggil data mp3
        var MediaPlayer: MediaPlayer? = MediaPlayer.create(
            this,
            R.raw.sebatasmimpi
        )

        //button yang berfungsi untuk memutar mp3
        btn_play.setOnClickListener {
            MediaPlayer?.start()
        }

        //button yang berfungsi untuk pause mp3
        btn_pause.setOnClickListener {
            MediaPlayer?.pause()
        }

        //button yang berfungsi untuk stop mp3
        btn_stop.setOnClickListener {
            MediaPlayer?.pause()
            MediaPlayer?.seekTo(0)
        }
    }
}
