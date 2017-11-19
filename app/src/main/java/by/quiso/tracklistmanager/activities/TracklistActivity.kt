package by.quiso.tracklistmanager.activities

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import by.quiso.tracklistmanager.R
import kotlinx.android.synthetic.main.activity_tracklist.*

/**
 * Tracklist activity - main application ativity.
 *
 * @author Pavel Davydzenka
 */

class TracklistActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tracklist)

        tracklistFab.setOnClickListener {
            startActivityForResult(Intent(this,
                    NewTracklistActivity::class.java), REQUEST_CODE) }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
    }

    companion object {
        private const val REQUEST_CODE = 1
    }
}