package by.quiso.tracklistmanager.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import by.quiso.tracklistmanager.R

/**
 * This activity displays window, where user can create new playlist.
 *
 * @author Pavel Davydzenka
 */

class NewTracklistActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_tracklist)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }
}