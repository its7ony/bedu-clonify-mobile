package s4

abstract class Artista(val nombre: String, val album: String, val listaCanciones: List<String>){

    abstract fun  reproducirArtista()

    abstract fun reproducirAlbum()

    abstract fun reproducirCanciones()

    abstract fun reproducirCancion(cancion:String)

    fun buscarArtista(nombreBusqueda:String):Boolean {
        return (nombreBusqueda==nombre)
    }

    fun buscarAlbum(nombreAlbum:String):Boolean{
        return (nombreAlbum==album)
    }

    fun buscarCancion(nombreCancion :String):Boolean{
        return nombreCancion.contains(nombreCancion)
    }
}