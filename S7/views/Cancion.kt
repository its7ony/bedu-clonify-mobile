package views

import helpers.noHayResultados
import helpers.seleccionarCancion
import helpers.trackController

fun buscarCancion(opcion: Int) {
    print("► Ingrese el nombre de la cancion: ")
    val songName = readLine()
    if (songName.toString().trim() != "") {
        trackController.getTracksByName(songName!!) { songList ->
            if (songList.isNullOrEmpty()) noHayResultados(opcion) else seleccionarCancion(songList, opcion=opcion)
        }
    }
}
