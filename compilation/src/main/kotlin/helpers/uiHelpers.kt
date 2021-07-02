package helpers

import controller.AlbumController
import controller.ArtistController
import controller.LyricsController
import controller.TrackController
import model.Album
import model.Track

val albumController = AlbumController()
val artistController = ArtistController()
val lyricsController = LyricsController()
val trackController = TrackController()

fun seleccionarCancion(songList: List<Track>, albumName: String = "", opcion: Int) {
    if (albumName != "") println("Lista de canciones del Álbum $albumName")
    songList.forEach { track -> println("${track.track_id} - ${track.track_name} por: ${track.artist_name}") }
    print("Selecciona una canción escribiendo su id: ")
    val trackId = readLine().toString()
    if(isInteger(trackId)){
        val trackFilter = songList.filter { it.track_id == trackId.toInt() }
        val track = if (trackFilter.isNotEmpty()) trackFilter.first() else null
        if (track == null) noHayResultados(opcion) else reproducirCancion(track)
    }else vuelveAIntentar()
}


fun reproducirCancion(track: Track) {
    println("Reproduciendo: ${track.track_name} de ${track.artist_name}")
    lyricsController.getLyricsByTrackId(track.track_id) { trackLyrics ->
        if (trackLyrics != null && trackLyrics.lyrics_body != "") {
            val explicit = if (trackLyrics.explicit) "\uD83C\uDD74" else ""
            print("Letra $explicit: ${trackLyrics.lyrics_body}\n\n")
        }
    }
}


fun seleccionarAlbum(albumList: List<Album>, artistName: String, opcion: Int) {
    println("Lista de Álbumes de $artistName")
    albumList.forEach { album -> println("${album.album_id} - ${album.album_name}") }
    print("Selecciona un Álbum escribiendo su id: ")
    val albumId = readLine().toString()
    val responseFilter = albumList.filter { it.album_id == albumId.toInt() }
    val albumName = if (responseFilter.isNotEmpty()) responseFilter.first().album_name else ""
    if (albumId.trim() != "" && albumName.trim() != "" && isInteger(albumId)) {
        trackController.getTracksByAlbumId(albumId.toInt()) { trackResponse ->
            if (trackResponse.isNullOrEmpty()) noHayResultados(opcion) else seleccionarCancion(trackResponse, albumName, opcion)
        }
    }else vuelveAIntentar()
}
