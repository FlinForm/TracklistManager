package by.quiso.tracklistmanager.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import by.quiso.tracklistmanager.R
import by.quiso.tracklistmanager.bl.Tracklist
import kotlinx.android.synthetic.main.activity_new_tracklist.*

/**
 * This activity displays window, where user can create new playlist.
 *
 * @author Pavel Davydzenka
 */
class NewTracklistActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_tracklist)

        initSpinner()
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }

    private fun initSpinner() {
        val genres = Tracklist.Genre.values()
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, genres)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        genreSpinner.adapter = adapter
        genreSpinner.setSelection(0)
    }
}