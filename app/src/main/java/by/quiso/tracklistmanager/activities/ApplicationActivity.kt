package by.quiso.tracklistmanager.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
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
        startActivity(Intent(this, TracklistActivity::class.java))
        finish()
    }


}
