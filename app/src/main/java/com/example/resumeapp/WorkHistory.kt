package com.example.resumeapp

import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class WorkHistory : AppCompatActivity() {
    private lateinit var job1Hist: TextView
    private lateinit var honeyHist2: TextView
    private lateinit var honeyHist3: TextView

    private lateinit var arcHist: TextView
    private lateinit var arcHist2: TextView
    private lateinit var arcHist3: TextView

    private lateinit var thruHist: TextView
    private lateinit var thruHist2: TextView
    private lateinit var thruHist3: TextView

    private lateinit var esHist: TextView
    private lateinit var esHist2: TextView
    private lateinit var esHist3: TextView

    private lateinit var bayHist: TextView
    private lateinit var bayHist2: TextView
    private lateinit var bayHist3: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // this tells the app which layout to associate with this class
        setContentView(R.layout.activity_workhistory)

        // now connect each view to a variable for manipulation
        job1Hist = findViewById(R.id.honeywellHistory)
        honeyHist2 = findViewById(R.id.honeywellHistory2)
        honeyHist3 = findViewById(R.id.honeywellHistory3)

        arcHist = findViewById(R.id.arcoHistory)
        arcHist2 = findViewById(R.id.arcoHistory2)
        arcHist3 = findViewById(R.id.arcoHistory3)

        thruHist = findViewById(R.id.thrulineHistory)
        thruHist2 = findViewById(R.id.thrulineHistory2)
        thruHist3 = findViewById(R.id.thrulineHistory3)

        esHist = findViewById(R.id.expressHistory)
        esHist2 = findViewById(R.id.expressHistory2)
        esHist3 = findViewById(R.id.expressHistory3)

        bayHist = findViewById(R.id.bayerHistory)
        bayHist2 = findViewById(R.id.bayerHistory2)
        bayHist3 = findViewById(R.id.bayerHistory3)
    }

    fun openjob1(view: View) {
        if (job1Hist.visibility === View.VISIBLE) {
            job1Hist.visibility = View.GONE
            honeyHist2.visibility = View.GONE
            honeyHist3.visibility = View.GONE
        } else {
            job1Hist.visibility = View.VISIBLE
            honeyHist2.visibility = View.VISIBLE
            honeyHist3.visibility = View.VISIBLE
        }
    }

    fun openBay(view: View) {
        if (bayHist.visibility === View.VISIBLE) {
            bayHist.visibility = View.GONE
            bayHist2.visibility = View.GONE
            bayHist3.visibility = View.GONE
        } else {
            bayHist.visibility = View.VISIBLE
            bayHist2.visibility = View.VISIBLE
            bayHist3.visibility = View.VISIBLE
        }
    }

    fun openArc(view: View) {
        if (arcHist.visibility === View.VISIBLE) {
            arcHist.visibility = View.GONE
            arcHist2.visibility = View.GONE
            arcHist3.visibility = View.GONE
        } else {
            arcHist.visibility = View.VISIBLE
            arcHist2.visibility = View.VISIBLE
            arcHist3.visibility = View.VISIBLE
        }
    }

    fun openEs(view: View) {
        if (esHist.visibility === View.VISIBLE) {
            esHist.visibility = View.GONE
            esHist2.visibility = View.GONE
            esHist3.visibility = View.GONE
        } else {
            esHist.visibility = View.VISIBLE
            esHist2.visibility = View.VISIBLE
            esHist3.visibility = View.VISIBLE
        }
    }

    fun openThru(view: View) {
        if (thruHist.visibility === View.VISIBLE) {
            thruHist.visibility = View.GONE
            thruHist2.visibility = View.GONE
            thruHist3.visibility = View.GONE
        } else {
            thruHist.visibility = View.VISIBLE
            thruHist2.visibility = View.VISIBLE
            thruHist3.visibility = View.VISIBLE
        }
    }
}