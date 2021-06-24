package models

import helpers.vuelveAIntentar

class Artista(var nombre: String, var listaDeAlbumes: List<Album>){

    fun obtenerListaDeAlbumes(){
        this.listaDeAlbumes.forEach {
            album -> println("${album.id} - ${album.nombre}")
        }

        seleccionarAlbum()
    }


    private fun seleccionarAlbum() {
        print("seleccione un número de álbum: ")
        val respuesta = readLine()

        if (respuesta != "" && respuesta != null) {
            val resultado = listaDeAlbumes.filter { it.id == respuesta.toInt() }
            if(resultado.isNotEmpty()) resultado.first().obtenerListaDeCanciones() else vuelveAIntentar()
        } else {
            vuelveAIntentar()
        }
    }
}