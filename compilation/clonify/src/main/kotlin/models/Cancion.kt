package models

class Cancion (var id: Int, var nombre: String, var duracion: String, var letra: String){
    fun reproducirCancion(cancion: Cancion){
        println("Reproduciendo ${cancion.nombre}")
    }
}