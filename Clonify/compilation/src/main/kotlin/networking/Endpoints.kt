package networking

class Endpoints {
    companion object Endpoints {
        internal fun getArtistByName(searchParameterName: String): String =
            "/artist.search?q_artist=${searchParameterName}&page_size=1&apikey="
        internal fun getAlbumsByArtistId(searchParameterId: Int): String = "/artist.albums.get?artist_id=$searchParameterId&s_release_date=desc&g_album_name=1&apikey="

        internal fun getLyricsByTrackId(searchParameterId: Int): String = "/track.lyrics.get?track_id=${searchParameterId}&apikey="

        internal fun getTracksByAlbumId(searchParameterId: Int): String ="/album.tracks.get?album_id=${searchParameterId}&page=1&apikey="

        internal fun getTracksByName(searchParameterName: String): String = "/track.search?q_track=${searchParameterName}&page_size=5&page=1&apikey="

        internal fun getTracksByTop5():String = "/chart.tracks.get?chart_name=top&page=1&page_size=5&f_has_lyrics=1&page_size=5&page=1&apikey="
    }
}
