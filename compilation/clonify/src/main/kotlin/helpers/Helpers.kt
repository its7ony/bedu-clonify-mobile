package helpers

import models.Album
import models.Artista
import models.Cancion
import ui.menuPrincipal
import kotlin.system.exitProcess

val listaDeArtistas = obtenerListaDeArtistas()
var sesionActiva = false

// obtenerListaDeArtistas = Permite obtener una lista de artistas creada
private fun obtenerListaDeArtistas():List<Artista>{
    return listOf(
        Artista("Metallica",
            listOf(
                Album(1,"Kill 'Em All", "Trash Metal",1983,
                    listOf(
                        Cancion(1,"Hit the Lights","4:17", "letra"),
                        Cancion(2,"The Four Horsemen","7:13", "letra")
                    )
                ),
                Album(2,"Ride the Lightning", "Trash Metal",1987,
                    listOf(
                        Cancion(1,"Fight Fire with Fire","4:44", "letra"),
                        Cancion(2,"Ride the Lightning","6:36", "letra")
                    )
                )
            )
        ),
        Artista("Ludovico Einaudi",
            listOf(
                Album(1,"Time Out", "Clásico",1988,
                    listOf(
                        Cancion(1,"Prima","1:13", "letra"),
                        Cancion(2,"Andante","5:24", "letra")
                    )
                )
            )
        ),

        Artista("Mattia Cupelli",
            listOf(
                Album(1,"Love & Loss", "Instrumental",2013,
                    listOf(
                        Cancion(1,"Love & Loss","9:45", "letra"),
                        Cancion(2,"Without You","7:31", "letra")
                    )
                )
            )
        )
    )
}

// realizarBusqueda = Permite realizar una búsqueda de acuerdo a las opciones del menú principal
fun realizarBusqueda(opcion: Int){

    when(opcion){
        1 -> {
            buscarArtista(opcion)

        }
        2 -> {
            buscarAlbum(opcion)
        }
        3 -> {
            buscarCancion(opcion)
        }

        4 -> {
            salir()
        }

        else -> {
            vuelveAIntentar()
        }
    }
}

// buscarArtista = Permite buscar un artista dentro de la lista de artistas
private fun buscarArtista(opcion: Int){
    print("Ingrese el nombre de artista: ")
    val nombreArtista= readLine()!!.toString()
    val resultado = listaDeArtistas.filter { artistaItem -> artistaItem.nombre == nombreArtista }

    if (resultado.isNotEmpty()){
        val artista = resultado.first()
        artista.obtenerListaDeAlbumes()

    }else{
        noHayResultados(opcion)
    }

}

// buscarAlbum = Permite buscar un álbum dentro de la lista de artistas
private fun buscarAlbum(opcion: Int){
    print("Ingrese el nombre del Album: ")
    val nombreAlbum= readLine()!!.toString()
    val resultado = listaDeArtistas.flatMap { artistaItem -> artistaItem.listaDeAlbumes }.filter { albumItem -> albumItem.nombre == nombreAlbum }

    if (resultado.isNotEmpty()){
        val album = resultado.first()
        album.obtenerListaDeCanciones()
    }else{
        noHayResultados(opcion)
    }
}

// buscarCancion = Permite buscar una canción dentro de la lista de artistas
private fun buscarCancion(opcion: Int){
    print("Ingrese el nombre de la Cancion: ")
    val nombreCancion= readLine()!!.toString()
    val resultado = listaDeArtistas.flatMap { artistaItem -> artistaItem.listaDeAlbumes.flatMap { albumItem -> albumItem.listaDeCanciones } }.filter { cancion -> cancion.nombre == nombreCancion }

    if (resultado.isNotEmpty()){
        val cancion = resultado.first()
        cancion.reproducirCancion(cancion)
    }else{
        noHayResultados(opcion)
    }

}

// noHayResultados = Muestra un menú secundario que nos permite realizar diversas acciones
fun noHayResultados(opcion: Int){

    print("No encontramos resultados para tu búsqueda. ¿Qué deseas hacer?: \n 1. Volver a Intentar \n 2. Volver al menu principal \n 3. Salir \n ")
    val respuesta = readLine()

    if(respuesta != null && isInteger(respuesta)) {

        when (respuesta.toInt()) {
            1 -> {
                realizarBusqueda(opcion)
            }

            2 -> {
                menuPrincipal()
            }

            3 -> {
                salir()
            }
            else -> {
                vuelveAIntentar()
            }
        }
    } else{
        vuelveAIntentar()
    }

}

// vuelveAIntentar = Permite volver al menú principal
fun vuelveAIntentar(){
    print("Vuelve a intentar\n")
    menuPrincipal()
}

// salir = Termina la ejecución del programa
fun salir(){
    print("Vuelva pronto :)")
    exitProcess(0)
}

// isInteger = Esta función nos devuelve si un string es válido o no para ser tratada como número
fun isInteger(str: String?) = str?.toIntOrNull()?.let { true } ?: false

