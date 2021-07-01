package s4

/*
Postwork
OBJETIVO

Implementar abstracciones de clases a nuestro proyecto para organizar mejor
Utilizar los Data Class para almacenar datos

*/

data class ArtistaData(var nombre:String, var listaAlbunes: List<String> )

data class AlbumData(var id: Int, var nombre: String, var genero: String, var lanzamiento: Int, var listaDeCanciones: List<String>)

data class  CancionData(var id: Int ,var nombre: String, var duracion: String, var letra: String)