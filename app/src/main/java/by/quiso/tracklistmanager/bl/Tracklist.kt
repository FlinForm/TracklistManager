package by.quiso.tracklistmanager.bl

/**
 * Tracklist model.
 *
 * @author Pavel Davydzenka
 */
class Tracklist(val name: String, val genre: Genre, val date: Long, val songs: ArrayList<Track>) {
    enum class Genre {
        METAL, ROCK, POP, ELECTRO, MIXED
    }

    class Track(val name: String, val author: String, val content: String)
}