package s3

/*
----------Cancion---------
- listaCanciones: List   -
--------------------------
- mostrarCancion()       -
- seleccionarCancion()   -
--------------------------

*/

class Cancion (val listaCanciones: List<String>){

    fun mostarCancion(){
        println(listaCanciones)
    }

    fun seleccionarCancion(){
        println("Ingrese la cancion que desea reproducir")
        val cancion= readLine()!!.toString()
        if (listaCanciones.contains(cancion)) {
            println("   ⏯ Reproduciendo $cancion♪ ")
        }else{
            println("No se encuentra la cancion")
        }
    }
}