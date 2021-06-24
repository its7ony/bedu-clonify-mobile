package s3


/*Reto final - Añadiendo POO al proyecto
OBJETIVO

Diseñar las entidades requeridas de acuerdo a la Programación Orientada a Objetos.
Implementar objetos en el proyecto final.
Adaptar el código previamente desarrollado a clases.

------Artista-------    ---------Album--------    --------Canciones-------
- nombreArtista    - -> - nombreArtista      - -> - nombreArtista        -
- totalAlbum       -    - nombreAlbum        -    - nombreAlbum          -
- totalCanciones   -    - totalCanciones     -    - nombreCancion        -
--------------------    ----------------------    - duracion             -
                                                ------------------------

Postwork
OBJETIVO

Diseñar clases con propiedades y métodos que representen correctamente un objeto.
Abstraer la lógica del proyecto final al paradigma que brinda POO


*/

class Artista(var nombreArtista: String, var totalAlbum: Int,var totalCanciones:Int){

    fun mostarDatos(){
        println("----------$nombreArtista------------")
        println("Cuenta con $totalAlbum albumes ")
        println("Cuenta con $totalCanciones canciones ")
    }

}

class Album(val nombreArtista: String, val nombreAlbum: String,val cantidadCanciones: Int){

    fun mostarDatos(){
        println("----------$nombreAlbum------------")
        println("Artista   $nombreArtista  ")
        println("Cuenta con $cantidadCanciones canciones ")
    }

}


class Cancion(val nombreArtista: String, val nombreAlbum: String,val nombreCancion: String, val duracionSegundos: Int){
    fun mostarDatos() {
        println("----------$nombreCancion------------")
        println("Artista   $nombreArtista  ")
        println("Album:    $nombreAlbum ")
        println("Duracion: $duracionSegundos")
    }
}