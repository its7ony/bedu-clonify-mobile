package helpers


import controller.AlbumController
import controller.ArtistController
import controller.LyricsController
import controller.TrackController
import model.Album
import model.Track
import views.*

val albumController = AlbumController()
val artistController = ArtistController()
val lyricsController = LyricsController()
val trackController = TrackController()

fun seleccionarCancion(songList: List<Track>, albumName: String = "", opcion: Int) {
    if (albumName != "") println(" \uD83D\uDDBF Lista de canciones del Álbum $albumName ")
    topBox()
    idName()
    songList.forEach { track -> println("${track.track_id} - ${track.track_name} por: ${track.artist_name}") }
    buttonBox()
    print("► Selecciona una canción escribiendo su id: ")
    val trackId = readLine().toString()
    if(isInteger(trackId)){
        val trackFilter = songList.filter { it.track_id == trackId.toInt() }
        val track = if (trackFilter.isNotEmpty()) trackFilter.first() else null
        if (track == null) noHayResultados(opcion) else reproducirCancion(track)
        topBox()
        menuPrincipal()
    }else vuelveAIntentar()
}


fun reproducirCancion(track: Track) {
    lyricsController.getLyricsByTrackId(track.track_id) { trackLyrics ->
        if (trackLyrics != null && trackLyrics.lyrics_body != "") {
            val explicit = if (trackLyrics.explicit) "\uD83C\uDD74" else ""
            topBox()
            print("Letra $explicit: ${trackLyrics.lyrics_body}\n\n")
            buttonBox()
            topBox()

        }
    }
    playTop()
    println("  ♫  ${track.track_name} de ${track.artist_name} ♫ ")
    playButton()
    topBox()
    menuPrincipal()
}


fun seleccionarAlbum(albumList: List<Album>, artistName: String, opcion: Int) {
    println(" \uD83D\uDDBF Lista de Álbumes de $artistName ★ " )
    topBox()
    idName()
    albumList.forEach { album -> println("${album.album_id} - ${album.album_name}") }
    buttonBox()
    print("► Selecciona un Álbum escribiendo su id: ")
    val albumId = readLine().toString()
    val responseFilter = albumList.filter { it.album_id == albumId.toInt() }
    val albumName = if (responseFilter.isNotEmpty()) responseFilter.first().album_name else ""
    if (albumId.trim() != "" && albumName.trim() != "" && isInteger(albumId)) {
        trackController.getTracksByAlbumId(albumId.toInt()) { trackResponse ->
            if (trackResponse.isNullOrEmpty()) noHayResultados(opcion) else seleccionarCancion(trackResponse, albumName, opcion)
        }
    }else vuelveAIntentar()
}
