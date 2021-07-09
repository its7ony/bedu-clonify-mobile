package views

import helpers.noHayResultados
import helpers.seleccionarCancion
import helpers.trackController

fun top5(opcion: Int) {
    trackController.getTracksByTop5 { songList ->
        topList()
        if (songList.isNullOrEmpty()) noHayResultados(opcion) else seleccionarCancion(songList, opcion=opcion)
    }
}
