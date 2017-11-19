package by.quiso.tracklistmanager.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import by.quiso.tracklistmanager.R

/**
 * Application activity.
 *
 * @author Pavel Davydzenka
 */
class ApplicationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_application)
        init()
    }

    private fun init() {
        Handler().postDelayed({ startTracklistActivity() }, 3000)
    }

    private fun startTracklistActivity() {
        startActivity(Intent(this, TracklistActivity::class.java))
        finish()
    }
}