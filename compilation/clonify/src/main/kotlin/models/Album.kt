package models

import helpers.vuelveAIntentar

class Album (var id: Int, var nombre: String, var genero: String, var lanzamiento: Int, var listaDeCanciones: List<Cancion> ){

    fun obtenerListaDeCanciones(){
        this.listaDeCanciones.forEach {
                cancion -> println("${cancion.id} - ${cancion.nombre}")
        }
        seleccionarCancion()
    }

    private fun seleccionarCancion(){
        println("seleccione un número de canción: ")
        val respuesta = readLine()

        if(respuesta != "" && respuesta != null){
            val resultado = listaDeCanciones.filter { it.id == respuesta.toInt() }
            if(resultado.isNotEmpty()) resultado.first().reproducirCancion(resultado[0]) else vuelveAIntentar()
        }else{
            vuelveAIntentar()
        }
    }
}
