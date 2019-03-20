package com.example.pshmakov.blacksurfaceviewsample

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.support.v4.app.ActivityOptionsCompat
import android.transition.Transition

import com.example.pshmakov.blacksurfaceviewsample2.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler().postDelayed({
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(this,
                    findViewById(R.id.img), "theTransition")
            val intent = Intent(this, TargetActivity::class.java)
            overridePendingTransition(R.anim.no_anim, R.anim.no_anim)
            startActivity(intent, options.toBundle())
            overridePendingTransition(R.anim.no_anim, R.anim.no_anim)
    }
}
