package PruebaProyectoSoloDataClasses

fun main(){

    val metallicaAlbumes= listOf<String>("Kill Em All","Ride the Lightning","Master of Puppets","Metallica","Load","Death Magnetic")
    val cancionesMetallicaKill= listOf<String>("Cancion1","Cancion2","Cancion3")

    val dataArtist= ArtistaData("Metallica",metallicaAlbumes)


    val dataAlbum=AlbumData(1,"Kill Em All","Heavy Metal",1983,cancionesMetallicaKill)
    val dataAlbum2=AlbumData(1,"Ride the Lightning","Heavy Metal",1983,cancionesMetallicaKill)
    val dataAlbum3=AlbumData(1,"Master of Puppets","Heavy Metal",1983,cancionesMetallicaKill)
    val dataAlbum4=AlbumData(1,"Load","Heavy Metal",1983,cancionesMetallicaKill)
    val dataAlbum5=AlbumData(1,"Death Magnetic","Heavy Metal",1983,cancionesMetallicaKill)
    val dataAlbum6=AlbumData(1,"Metallica","Heavy Metal",1983,cancionesMetallicaKill)

    val killEmAllCan1=CancionData(1,"Hit the Lights","6:20","da da da da da da da")
    val killEmAllCan2=CancionData(2,"The Four Horsemen","6:10","de de de de de de de")
    val killEmAllCan3=CancionData(3,"Motorbreath","6:00","di di di di di di")
    val killEmAllCan4=CancionData(4,"Jump in the Fire","5:50","do do do do do")
    val killEmAllCan5=CancionData(5,"Seek and Destroy","5:40","du du du du du du")


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
            when(nombreArtista){
                dataArtist.nombre-> {
                    println(dataArtist.listaAlbunes)
                }else->{
                    println("Opcion no encontrada")
                }
            }
        }
        2->{
            print("Ingrese el nombre del Album: ")
            val nombreAlbum= readLine()!!.toString()
            when(nombreAlbum){
                dataAlbum.nombre->{
                    println(dataAlbum.listaDeCanciones)
                    println("Cancion: ${killEmAllCan1.nombre} ")
                    println("Letra: ${killEmAllCan1.letra}.")
                }
                dataAlbum2.nombre->{
                    println(dataAlbum2.listaDeCanciones)
                    println("Cancion: ${killEmAllCan2.nombre} ")
                    println("Letra: ${killEmAllCan2.letra}.")

                }
                dataAlbum3.nombre->{
                    println(dataAlbum3.listaDeCanciones)
                    println("Cancion: ${killEmAllCan3.nombre} ")
                    println("Letra: ${killEmAllCan3.letra}.")
                }
                dataAlbum4.nombre->{
                    println(dataAlbum4.listaDeCanciones)
                    println("Cancion: ${killEmAllCan4.nombre} ")
                    println("Letra: ${killEmAllCan4.letra}.")
                }
                dataAlbum5.nombre->{
                    println(dataAlbum5.listaDeCanciones)
                    println("Cancion: ${killEmAllCan5.nombre} ")
                    println("Letra: ${killEmAllCan5.letra}.")
                }
                dataAlbum6.nombre->{
                    println(dataAlbum5.listaDeCanciones)
                    println("Cancion: ${killEmAllCan5.nombre} ")
                    println("Letra: ${killEmAllCan5.letra}.")
                }
                else->{
                    println("Opcion no encontrada")
                }
            }
        }
        3->{
            print("Ingrese el nombre de la Cancion: ")
            val nombreCancion= readLine()!!.toString()
            when(nombreCancion){
                killEmAllCan1.nombre->{
                    println(killEmAllCan1.letra)
                }
                killEmAllCan2.nombre->{
                println(killEmAllCan1.letra)
                }
                killEmAllCan3.nombre->{
                    println(killEmAllCan1.letra)
                }
                killEmAllCan4.nombre->{
                    println(killEmAllCan1.letra)
                }
                killEmAllCan5.nombre->{
                    println(killEmAllCan1.letra)
                }
                else ->{
                    println("Opcion no encontrada")
                }
            }
        }
        4-> {
            print("¡Hasta pronto!")
        }
        else-> {
            print("Opcion no encontrada")
        }
    }

}

