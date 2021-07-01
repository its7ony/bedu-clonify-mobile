package PruebaProyectoSoloDataClasses

data class ArtistaData(var nombre:String, var listaAlbunes: List<String> )

data class AlbumData(var id: Int, var nombre: String, var genero: String, var lanzamiento: Int, var listaDeCanciones: List<String>)

data class  CancionData(var id: Int ,var nombre: String, var duracion: String, var letra: String)