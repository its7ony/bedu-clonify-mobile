package helpers


import views.*
import kotlin.system.exitProcess

// realizarBusqueda = Permite realizar una búsqueda de acuerdo a las opciones del menú principal
fun realizarBusqueda(opcion: Int){

    when(opcion){
        1 -> {
            top5(opcion)
        }
        2 -> {
            buscarArtista(opcion)
        }
        3 -> {
            buscarCancion(opcion)
        }

        4 -> {
            salir()
        }

        else -> {
            vuelveAIntentar()
        }
    }
}

// noHayResultados = Muestra un menú secundario que nos permite realizar diversas acciones
fun noHayResultados(opcion: Int){
    topBox()
    print(" \uD83D\uDCA1 No encontramos resultados para tu búsqueda. ¿Qué deseas hacer? \n 1. Volver a Intentar \n 2. Volver al menu principal \n 3. Salir \n ")
    buttonBox()
    print("► Ingresar opcion:")
    val respuesta = readLine()


    if(respuesta != null && isInteger(respuesta)) {

        when (respuesta.toInt()) {
            1 -> {
                realizarBusqueda(opcion)
            }

            2 -> {
                menuPrincipal()
            }

            3 -> {
                salir()
            }
            else -> {
                vuelveAIntentar()
            }
        }
    } else{
        vuelveAIntentar()
    }

}

// vuelveAIntentar = Permite volver al menú principal
fun vuelveAIntentar(){
    topBox()
    print(" ◔ Vuelve a intentarlo     \n")
    buttonBox()
    topBox()
    menuPrincipal()
}

// salir = Termina la ejecución del programa
fun salir(){
    goodBye()
    exitProcess(0)
}
