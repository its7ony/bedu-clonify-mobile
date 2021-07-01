package s4


fun main(){
    /*
    val canciones= listOf("Enter Sadman","The Unforgiven","Wherever I May Roam","Battery")
    val artista = Album("Metallica", "Metallica", "Tash Metal",1990, canciones )
    println(artista.reproducirCanciones())
    */
    // Datos almacenados en el Data Class

    //se ocupo una sola lista de canciones para todos los albunes, sin embargo, debe de implementarse 1 para cada album
    val metallicaAlbumes= listOf<String>("Kill Em All","Ride the Lightning","Master of Puppets","Metallica","Load","Death Magnetic")
    val cancionesMetallicaKill= listOf<String>("Cancion1","Cancion2","Cancion3")

    val dataArtist= ArtistaData("Metallica",metallicaAlbumes)


    val dataAlbum= AlbumData(1,"Kill Em All","Heavy Metal",1983,cancionesMetallicaKill)
    val dataAlbum2= AlbumData(1,"Ride the Lightning","Heavy Metal",1983,cancionesMetallicaKill)
    val dataAlbum3= AlbumData(1,"Master of Puppets","Heavy Metal",1983,cancionesMetallicaKill)
    val dataAlbum4= AlbumData(1,"Load","Heavy Metal",1983,cancionesMetallicaKill)
    val dataAlbum5= AlbumData(1,"Death Magnetic","Heavy Metal",1983,cancionesMetallicaKill)
    val dataAlbum6= AlbumData(1,"Metallica","Heavy Metal",1983,cancionesMetallicaKill)

    val killEmAllCan1= CancionData(1,"Hit the Lights","6:20","da da da da da da da")
    val killEmAllCan2= CancionData(2,"The Four Horsemen","6:10","de de de de de de de")
    val killEmAllCan3= CancionData(3,"Motorbreath","6:00","di di di di di di")
    val killEmAllCan4= CancionData(4,"Jump in the Fire","5:50","do do do do do")
    val killEmAllCan5= CancionData(5,"Seek and Destroy","5:40","du du du du du du")


    // Datos llamados en las clases
    val artista=Album(dataArtist.nombre,dataAlbum.nombre,dataAlbum.genero,dataAlbum.lanzamiento,dataAlbum.listaDeCanciones)


    // Menu

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

    when(readLine()!!.toInt()){
        1-> {
            print("Ingrese el nombre del Artista: ")
            val nombreArtista= readLine()!!.toString()
            if (artista.buscarArtista(nombreArtista)){
                println(artista.reproducirArtista())
            }
        }
        2->{
            print("Ingrese el nombre del Album: ")
            val nombreAlbum= readLine()!!.toString()
            when(nombreAlbum){
                "Kill Em All"->{
                    artista.reproducirAlbum()
                }else->{
                    print("Album no encontrado")
                }
            }
        }
        3->{
            print("Ingrese el nombre de la Cancion: ")
            val nombreCancion= readLine()!!.toString()
            if (artista.buscarCancion(nombreCancion)){
                artista.reproducirCancion(nombreCancion)
            }
        }
        4->print("¡Hasta pronto!")
        else-> print("Opcion no encontrada")
    }

}
