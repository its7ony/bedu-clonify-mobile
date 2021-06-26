package s3

/*

-----------Album----------
- id: Int                -
- listaAlbunes: String   -
- listaCanciones: String -
--------------------------
- mostrarAlbum()         -
- reproducirAlbum()      -
- seleccionarAlbum()     -
--------------------------

*/

class Album (var id: Int, var nombre: String, var genero: String, var lanzamiento: Int, var listaDeCanciones: List<String> ){



    fun reproducirAlbum(){
        var contador=0
        println("═══════════════╣ Reproduciendo $nombre ╠═══════════════")
        for (i in 1..listaDeCanciones.size){
            println("  ⏯ Reproduciendo:  " + listaDeCanciones[contador] + " ♪ ")
            contador++
        }
    }

    fun bucarCancion(){
        println("Lista de canciones \n$listaDeCanciones")
        print("Ingrese el nombre: ")
        val cancion= readLine()!!.toString()
        if (listaDeCanciones.contains(cancion)) {
            println("   ⏯ Reproduciendo $cancion ♪ ")
        }else{
            println("Cancion no encontrada")
        }
    }
}
