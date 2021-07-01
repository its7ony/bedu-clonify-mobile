package s5.models

abstract class Persona(val nombreReal:String, paterno:String, materno:String, edad:Int,genero:String,){

    abstract fun obtenerNombre()
    abstract fun obtenerGenero()
    abstract fun obtenerEdad()

}