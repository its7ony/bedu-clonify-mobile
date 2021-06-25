package s2

/*
Reto final - Implementando programación estructurada

OBJETIVO
-Sintetizar los temas de la Sesión 2 para aplicarlos al proyecto final.
-Programar con elementos de programación estructurada la lógica básica de nuestro proyecto.
-Almacenar datos requeridos para nuestro proyecto en estructuras.


Postwork

OBJETIVO
Sintetizar los temas de la Sesión 2 para aplicarlos al proyecto final

 */

fun opcionesMenu(artista: String,album:String,listaCanciones:List<String>){

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
    var opcion= readLine()!!.toInt()

    when(opcion){
        1-> {
            buscarArtista(artista,album,listaCanciones)
        }
        2->{
            buscarAlbum(album,listaCanciones)
        }
        3->{
            buscarCancion(listaCanciones)
        }
        4->print("¡Hasta pronto!")
        else-> print("Opcion no encontrada")
    }
}

fun buscarArtista(artista: String,album: String,listaCanciones: List<String>){
    print("Ingrese el nombre de artista: ")
    val nombreArtista= readLine()!!.toString()
    if(artista.contains(nombreArtista)){
        println(nombreArtista )
        println("Albunes: $album")
        println("Canciones disponibles: $listaCanciones")
    }else{
        println("Artista no encontrado")
    }
}

fun buscarAlbum(album: String,listaCanciones:List<String>){
    print("Ingrese el nombre del Album: ")
    val nombreAlbum= readLine()!!.toString()
    if(album.contains(nombreAlbum)){
        reproducirAlbum(nombreAlbum,listaCanciones)
    }else{
        println("Artista no encontrado")
    }
}

fun buscarCancion(listaCanciones: List<String>){
    print("Ingrese el nombre de la Cancion: ")
    val nombreCancion= readLine()!!.toString()
    if(listaCanciones.contains(nombreCancion)){
        reproducirCancion(nombreCancion)
    }else{
        println("Cancion no encontrado")
    }

}

fun reproducirAlbum(album:String,listaCanciones:List<String>){
    var contador=0
    println("═══════════════╣ Reproduciendo $album ╠═══════════════")
    for (i in 1..listaCanciones.size){
        println("  ⏯ Reproduciendo:  " + listaCanciones[contador] + " ♪ ")
        contador++
    }

}

fun reproducirCancion(cancion:String){
    println("   ⏯ Reproduciendo $cancion ♪ ")
}
