package s3

/*
Reto final - Añadiendo POO al proyecto
OBJETIVO

- Diseñar las entidades requeridas de acuerdo a la Programación Orientada a Objetos.
- Implementar objetos en el proyecto final.
- Adaptar el código previamente desarrollado a clases.

Postwork
OBJETIVO

Diseñar clases con propiedades y métodos que representen correctamente un objeto.
Abstraer la lógica del proyecto final al paradigma que brinda POO

Opciones Disponibles

1 Artista : Metallica
2 Albunes : Master of Puppets y Metallica
3 Canciones : Enter Sadman,The Unforgiven, Wherever I May Roam,Battery, Master of Puppets, Welcome, Home y Orion.

*/

fun main(){

    //Lista de Albunes
    val metallicaAlbunes= listOf("Master of Puppets","Metallica")

    //Canciones de Albunes
    val metallica= listOf("Enter Sadman","The Unforgiven","Wherever I May Roam")
    val masterOfPuppets= listOf("Battery","Master of Puppets","Welcome Home","Orion")

    //Album
    val album=Album("Master of Puppets","Trash Metal",1996,masterOfPuppets)
    val album1=Album("Metallica","Trash Metal",1991,metallica)

    //Artista
    val artista1=Artista("Metallica",metallicaAlbunes)

    //Canciones
    val listaCanciones= listOf("Enter Sadman","The Unforgiven","Wherever I May Roam","Battery","Master of Puppets","Welcome Home","Orion")
    val canciones=Cancion(listaCanciones)


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
            if (artista1.buscarArtista()){
                when(artista1.seleccionarAlbum()){
                    "Master of Puppets" -> album.bucarCancion()
                    "Metallica"-> album1.bucarCancion()
                }
            }else{
                print("Artista no encontrado")
            }
        }
        2->{
            when(artista1.seleccionarAlbum()){
                "Master of Puppets"->{
                    println("1) Reproducir todo el album \n2) Buscar cancion")
                    val opciones= readLine()!!.toInt()
                    when(opciones){
                        1-> album.reproducirAlbum()
                        2-> album.bucarCancion()
                    }
                }
                "Metallica"->{
                    println("1) Reproducir todo el album \n2) Buscar cancion")
                    val opciones= readLine()!!.toInt()
                    when(opciones){
                        1-> album1.reproducirAlbum()
                        2-> album1.bucarCancion()
                    }
                }
            }
        }
        3->{
            canciones.mostarCancion()
            canciones.seleccionarCancion()
        }
        4->print("¡Hasta pronto!")
        else-> print("Opcion no encontrada")
    }
}
