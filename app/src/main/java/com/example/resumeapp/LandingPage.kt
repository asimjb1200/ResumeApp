package com.example.resumeapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_landing_page.*

class LandingPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing_page)
        setSupportActionBar(toolbar)
    }

    fun openAboutMe(view: View) {
        val intent = Intent(this, AboutMe::class.java)
        startActivity(intent)
    }

    fun openWorkHistory(view: View) {
        val intent = Intent(this, WorkHistory::class.java)
        startActivity(intent)
    }

    fun openEducation(view: View) {
        val intent = Intent(this, Education::class.java)
        startActivity(intent)
    }

    fun openContactMe(view: View) {
        val intent = Intent(this, ContactMe::class.java)
        startActivity(intent)
    }

}
