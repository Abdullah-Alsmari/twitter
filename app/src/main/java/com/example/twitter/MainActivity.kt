package com.example.twitter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    var isLiked = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val likeIcon = findViewById<ImageView>(R.id.img3)
        likeIcon.setOnClickListener {
            if(isLiked){
                likeIcon.setImageResource(R.drawable.img5);
            }else{
                likeIcon.setImageResource(R.drawable.l5);
            }

            isLiked = !isLiked; // reverse

        }

    }
}