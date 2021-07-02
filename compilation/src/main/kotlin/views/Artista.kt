package views

import helpers.albumController
import helpers.artistController
import helpers.noHayResultados
import helpers.seleccionarAlbum


fun buscarArtista(opcion: Int) {
    print("Ingrese el nombre de un artista: ")
    val artistName = readLine()
    if (artistName.toString().trim() != "" ) {
        artistController.getArtistByName(artistName!!) { artist ->
            if (artist != null) {
                albumController.getAlbumsByArtistId(artist.artist_id) { responseList ->
                    if (responseList != null) seleccionarAlbum(responseList, artistName, opcion) else noHayResultados(opcion)
                }
            } else noHayResultados(opcion)
        }
    }else noHayResultados(opcion)
}