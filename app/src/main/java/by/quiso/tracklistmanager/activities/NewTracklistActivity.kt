package by.quiso.tracklistmanager.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.ArrayAdapter
import android.widget.PopupMenu
import by.quiso.tracklistmanager.R
import by.quiso.tracklistmanager.bl.Tracklist
import kotlinx.android.synthetic.main.activity_new_tracklist.*

/**
 * This activity displays window, where user can create new playlist.
 *
 * @author Pavel Davydzenka
 */
class NewTracklistActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var addTrackPopupMenu: PopupMenu

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_tracklist)

        addButton.setOnClickListener(this)


        initSpinner()
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }

    override fun onClick(p0: View?) {
        when (p0!!.id) {
            R.id.addButton -> {
                initPopupMenu(p0)
                addTrackPopupMenu.show()
            }
        }
    }

    private fun initSpinner() {
        val genres = Tracklist.Genre.values()
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, genres)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        genreSpinner.adapter = adapter
        genreSpinner.setSelection(0)
    }

    private fun initPopupMenu(view: View?) {
        addTrackPopupMenu = PopupMenu(this, view)
        addTrackPopupMenu.menu.add(IMPORT_FROM_FILE)
        addTrackPopupMenu.menu.add(LOAD_FROM_INTERNET)
        addTrackPopupMenu.menu.add(WRITE_BY_YOURSELF)
    }

    companion object {
        private const val IMPORT_FROM_FILE = "Import from file"
        private const val LOAD_FROM_INTERNET = "Load from internet"
        private const val WRITE_BY_YOURSELF = "Write by yourself"
    }
}