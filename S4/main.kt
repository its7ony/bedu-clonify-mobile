package s4


/*

Reto final
OBJETIVO

Orientar el proyecto a un diseño apegado a POO
Dimensionar las posibilidades de integración de los temas vistos en la sesión al proyecto.


*/


fun main(){
    val respuesta=0

    val canciones= listOf("Enter Sadman","The Unforgiven","Wherever I May Roam","Battery")
    val artista = Album("Metallica", "Metallica", "Tash Metal",1990, canciones )
    println(artista.reproducirCanciones())

    // Menu

    println(" ██████╗ ██╗       ██████╗  ███╗   ██╗ ██╗ ███████╗ ██╗   ██╗\n" +
            "██╔════╝ ██║      ██╔═══██╗ ████╗  ██║ ██║ ██╔════╝ ╚██╗ ██╔╝\n" +
            "██║      ██║      ██║   ██║ ██╔██╗ ██║ ██║ █████╗    ╚████╔╝ \n" +
            "██║      ██║      ██║   ██║ ██║╚██╗██║ ██║ ██╔══╝     ╚██╔╝  \n" +
            "╚██████╗ ███████╗ ╚██████╔╝ ██║ ╚████║ ██║ ██║         ██║   \n" +
            " ╚═════╝ ╚══════╝  ╚═════╝  ╚═╝  ╚═══╝ ╚═╝ ╚═╝         ╚═╝   \n" +
            "                                                       ")
    println("------------------1) Buscar por Artista--------------------")
    println("------------------2) Buscar por Album ---------------------")
    println("------------------3) Buscar por Cancion--------------------")
    println("------------------4) Salir --------------------------------")
    print("Opcion: ")

    when(readLine()!!.toInt()){
        1-> {
            print("Ingrese el nombre del Artista: ")
            val nombreArtista= readLine()!!.toString()
            if (artista.buscarArtista(nombreArtista)){
                println(artista.reproducirArtista())
            }
        }
        2->{
            print("Ingrese el nombre del Album: ")
            val nombreAlbum= readLine()!!.toString()
            if (artista.buscarAlbum(nombreAlbum)){
                artista.reproducirArtista()
            }
        }
        3->{
            print("Ingrese el nombre de la Cancion: ")
            val nombreCancion= readLine()!!.toString()
            if (artista.buscarCancion(nombreCancion)){
                artista.reproducirCancion(nombreCancion)
            }
        }
        4->print("¡Hasta pronto!")
        else-> print("Opcion no encontrada")
    }

}
