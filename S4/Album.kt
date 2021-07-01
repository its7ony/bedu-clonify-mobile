package s4

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