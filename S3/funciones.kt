package s3


fun opcionesMenu(){
    println(" ██████╗ ██╗       ██████╗  ███╗   ██╗ ██╗ ███████╗ ██╗   ██╗\n" +
            "██╔════╝ ██║      ██╔═══██╗ ████╗  ██║ ██║ ██╔════╝ ╚██╗ ██╔╝\n" +
            "██║      ██║      ██║   ██║ ██╔██╗ ██║ ██║ █████╗    ╚████╔╝ \n" +
            "██║      ██║      ██║   ██║ ██║╚██╗██║ ██║ ██╔══╝     ╚██╔╝  \n" +
            "╚██████╗ ███████╗ ╚██████╔╝ ██║ ╚████║ ██║ ██║         ██║   \n" +
            " ╚═════╝ ╚══════╝  ╚═════╝  ╚═╝  ╚═══╝ ╚═╝ ╚═╝         ╚═╝   \n" +
            "                                                       ")
    println("------------------1) Buscar por Artista--------------------")
    println("------------------2) Buscar por Album ---------------------")
    println("------------------3) Buscar por Cancion--------------------")
    println("------------------4) Salir --------------------------------")
    print("Opcion: ")
    var opcion= readLine()!!.toInt()

    when(opcion){
        1-> {
            println("Ingresa el nombre del Artista: ")
            val nombre= readLine()!!.toString()
            art(nombre)
        }
        2->{
            println("Ingresa el nombre del Album: ")
            val nombre= readLine()!!.toString()
            alb(nombre)
        }
        3->{
            println("Ingresa el nombre de la cancion: ")
            val nombre= readLine()!!.toString()
            can(nombre)
        }
        4->print("¡Hasta pronto!")
        else-> opcionesMenu()
    }
}


fun art(nombreArtista: String){
    var artista1=Artista("artista1",2,23)
    var artista2=Artista("artista2",3,12)
    var artista3=Artista("artista3",4,42)
    var artista4=Artista("artista4",3,25)
    var artista5=Artista("artista5",1,24)
    var artista6=Artista("artista6",2,25)

    when(nombreArtista){
        "Artista1"->{
            println("Artista encontrado")
            artista1.mostarDatos()
        }
        "Artista2"->{
            println("Artista encontrado")
            artista2.mostarDatos()
        }
        "Artista3"->{
            println("Artista encontrado")
            artista3.mostarDatos()
        }
        "Artista4"->{
            println("Artista encontrado")
            artista4.mostarDatos()
        }
        "Artista5"->{
            println("Artista encontrado")
            artista5.mostarDatos()
        }
        "Artista6"-> {
            println("Artista encontrado")
            artista6.mostarDatos()
        }else -> print("No se encuentra")
    }
}


fun alb(nombreAlbum: String){
    var album1=Album("artista1","album1",23)
    var album2=Album("artista1","album1",12)
    var album3=Album("artista1","album1",42)
    var album4=Album("artista1","album1",25)
    var album5=Album("artista1","album1",24)
    var album6=Album("artista1","album1",25)

    when(nombreAlbum){
        "Album1"->{
            println("Album encontrado")
            album1.mostarDatos()
        }
        "Album2"->{
            println("Album encontrado")
            album2.mostarDatos()
        }
        "Album3"->{
            println("Album encontrado")
            album3.mostarDatos()
        }
        "Album4"->{
            println("Album encontrado")
            album4.mostarDatos()
        }
        "Album5"->{
            println("Album encontrado")
            album5.mostarDatos()
        }
        "Album6"-> {
            println("Album encontrado")
            album6.mostarDatos()
        }else -> print("No se encuentra")
    }

}


fun can(nombreCancion: String){
    var cancion1=Cancion("artista1","album1","nombre1",202)
    var cancion2=Cancion("artista2","album2","nombre2",203)
    var cancion3=Cancion("artista3","album3","nombre3",122)
    var cancion4=Cancion("artista4","album4","nombre4",321)
    var cancion5=Cancion("artista5","album5","nombre5",131)
    var cancion6=Cancion("artista6","album6","nombre6",312)

    when(nombreCancion){
        "Cancion1"->{
            println("Cancion encontrada")
            cancion1.mostarDatos()
        }
        "Cancion2"->{
            println("Cancion encontrada")
            cancion2.mostarDatos()
        }
        "Cancion3"->{
            println("Cancion encontrada")
            cancion3.mostarDatos()
        }
        "Cancion4"->{
            println("Cancion encontrada")
            cancion4.mostarDatos()
        }
        "Cancion5"->{
            println("Cancion encontrada")
            cancion5.mostarDatos()
        }
        "Cancion6"-> {
            println("Cancion encontrada")
            cancion6.mostarDatos()
        }else -> print("No se encuentra")
    }

}


