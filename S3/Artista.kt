package s3

/*
--------Artista----------
- nombreArtista: String -
- listaAlbunes: List    -
- totalCanciones        -
-------------------------
- retornarArtista()     -
- mostrarAlbunes()      -
- retornarAlbum()       -
-------------------------

*/

class Artista(var nombre: String, var listaDeAlbumes: List<String>){

    fun buscarArtista():Boolean{
        print("Ingrese el nombre: ")
        val name= readLine()!!.toString()
        return name==nombre
    }

    fun seleccionarAlbum():String{
        println("Albunes disponibles: ")
        println(listaDeAlbumes)
        print("Seleccione un album: ")
        val nombreAl= readLine()!!.toString()
        return nombreAl
    }

    fun mostrarAlbunes(){
        println("Albunes disponibles: ")
        println(listaDeAlbumes)
    }

}