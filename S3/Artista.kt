package s3

/*
--------Artista----------
- buscarArtista: String -
- seleccionarAlbum: List-
-------------------------
- buscarArtista()       -
- seleccionarAlbum()    -
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


}