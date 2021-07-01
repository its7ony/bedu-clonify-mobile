package models

import helpers.vuelveAIntentar
import s5.models.Persona

class Artista(nombreReal:String,paterno:String, materno:String,edad:Int,genero:String ,var nombre: String, var listaDeAlbumes: List<Album>):Persona(nombreReal,paterno,materno,edad,genero){

    fun obtenerListaDeAlbumes(){
        this.listaDeAlbumes.forEach {
            album -> println("${album.id} - ${album.nombre}")
        }

        seleccionarAlbum()
    }


    private fun seleccionarAlbum() {
        print(" Seleccione un número de álbum ►  ")
        val respuesta = readLine()

        if (respuesta != "" && respuesta != null) {
            val resultado = listaDeAlbumes.filter { it.id == respuesta.toInt() }
            if(resultado.isNotEmpty()) resultado.first().obtenerListaDeCanciones() else vuelveAIntentar()
        } else {
            vuelveAIntentar()
        }
    }

    override fun obtenerNombre() {

    }

    override fun obtenerGenero() {

    }

    override fun obtenerEdad() {

    }
}