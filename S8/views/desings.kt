package views

import helpers.sesionActiva
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeout

fun topList(){
    println("┌───────────────────────────────────────────────────────────────────────────────────┐")
    println("│  ❮  ❱              ▷ Top 5 Canciones de esta semana ♬        Mexico ▾   \uD83D\uDDD5  \uD83D\uDDD6  \uD83D\uDDD9︎ │")
    println("└───────────────────────────────────────────────────────────────────────────────────┘")
}


fun registerUser(){
    println("┌───────────────────────────────────────────────────────────────────────────────────┐")
    println("│  ❮                               Iniciar sesión                         \uD83D\uDDD5  \uD83D\uDDD6  \uD83D\uDDD9︎ │")
    println("├───────────────────────────────────────────────────────────────────────────────────┤")
}

fun topBox(){
    println("┌───────────────────────────────────────────────────────────────────────────────────┐")
}

fun buttonBox(){
    println("└───────────────────────────────────────────────────────────────────────────────────┘")
}

fun mainMenu(){
    println("│             ██████╗ ██╗       ██████╗  ███╗   ██╗ ██╗ ███████╗ ██╗   ██╗          │\n" +
            "│            ██╔════╝ ██║      ██╔═══██╗ ████╗  ██║ ██║ ██╔════╝ ╚██╗ ██╔╝          │\n" +
            "│            ██║      ██║      ██║   ██║ ██╔██╗ ██║ ██║ █████╗    ╚████╔╝           │\n" +
            "│            ██║      ██║      ██║   ██║ ██║╚██╗██║ ██║ ██╔══╝     ╚██╔╝            │\n" +
            "│            ╚██████╗ ███████╗ ╚██████╔╝ ██║ ╚████║ ██║ ██║         ██║             │\n" +
            "│             ╚═════╝ ╚══════╝  ╚═════╝  ╚═╝  ╚═══╝ ╚═╝ ╚═╝         ╚═╝             │\n" +
            "│                                                                                   │\n" +
            "│                              ➤ 1) Ver el Top 5                                    │\n" +
            "│                                2) Buscar por Artista                              │\n" +
            "│                                3) Buscar por Cancion                              │\n" +
            "│                                4) Salir                                           │\n" +
            "└───────────────────────────────────────────────────────────────────────────────────┘ ")
    print("► Selecciona una una opcion: ")

}

fun playTop(){
    println("┌───────────────────────────────────────────────────────────────────────────────────┐")
    println("│  ❮                                 Reproduciendo ♬                      \uD83D\uDDD5  \uD83D\uDDD6  \uD83D\uDDD9︎ │")
    println("├───────────────────────────────────────────────────────────────────────────────────┤")
    println("│                                                                                   │")

}

fun playButton(){
    println("                                ♥       ⏮ ⏸ ⏭       ↺                               ")
    println("                                                                                     ")
    stay()
    println("")
    println("└───────────────────────────────────────────────────────────────────────────────────┘")

}

fun idName(){
    println("    ID       Nombre                       Artista(s)                                 ")
}

fun goodBye(){
    println("┌───────────────────────────────────────────────────────────────────────────────────┐")
    println("                                   ¡Hasta pronto!                                    ")
    println("                                                                                    \n" +
            "                                          ████                                      \n" +
            "                                          ██████                                    \n" +
            "                                          ██    ██                                  \n" +
            "                                          ██                                        \n" +
            "                                          ██                                        \n" +
            "                                    ████████                                        \n" +
            "                                  ██████████                                        \n" +
            "                                  ██████████                                        \n" +
            "                                    ██████                                          \n" +
            "                                                                                     ")
    println("└───────────────────────────────────────────────────────────────────────────────────┘")
}

fun loading() = runBlocking {

    topBox()
    withTimeout(10_000L) {
        repeat(10) { i ->
            println(" ⧗ Cargando ${(i * 10) + 10}% ...")
            delay(300L)
        }
    }
    buttonBox()

}

fun stay() = runBlocking {

    withTimeout(15_000L) {
        repeat(10) { i ->
            print(" ▄ ▇ ▁ ▃")
            i*10+10
            delay(1000L)
        }
    }


}