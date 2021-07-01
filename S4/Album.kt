package s4

/*

Reto final
OBJETIVO

Orientar el proyecto a un diseño apegado a POO
Dimensionar las posibilidades de integración de los temas vistos en la sesión al proyecto.

*/

class Album(nombre: String,album: String, val genero: String, val lanzamiento: Int, listaCanciones: List<String>): Artista(nombre,album, listaCanciones) {
    override fun reproducirArtista() {
        println("Reproduciendo $nombre")
    }

    override fun reproducirAlbum() {
        println("Reproduciendo $album" )
    }

    override fun reproducirCanciones() {
        println("Reproduciendo $listaCanciones")
    }

    override fun reproducirCancion(cancion:String) {
        println("Reproduciendo $cancion")
    }


}