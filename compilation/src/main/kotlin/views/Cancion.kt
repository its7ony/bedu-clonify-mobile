package views

import helpers.noHayResultados
import helpers.seleccionarCancion
import helpers.trackController

fun buscarCancion(opcion: Int) {
    print("Ingrese el nombre de una canción: ")
    val songName = readLine()
    if (songName.toString().trim() != "") {
        trackController.getTracksByName(songName!!) { songList ->
            if (songList.isNullOrEmpty()) noHayResultados(opcion) else seleccionarCancion(songList, opcion=opcion)
        }
    }
}

