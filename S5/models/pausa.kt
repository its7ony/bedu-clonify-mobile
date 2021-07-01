package Carpeta_de_practica
fun main () {
     class Cancion(var id: Int, var nombre: String, var duracion: String, var letra: String) {
        fun reproducirCancion(cancion: Cancion) {

            println("╔═════════════════════☻Reproduciendo☻═════════════════════╗")
            println("   ←                        ▄▄                            ")
            println("                         ▄▄ ██ ▄▄ ██ ▄▄                     ")
            println("                       ▄▄██ ██ ██ ██ ██▄▄                   ")
            println("                        ${cancion.nombre}                   ")
            println("                ─────◉──────────────────────── $duracion    ")
            println("                      ♥     ⏮ ⏸ ⏭     ↺                   ")
            println("╚═══════════════════════════════════════════════════════════╝")
        }
        fun pausarCancion(cancion: Cancion){

            println("╔═════════════════════════☻Pausa☻═════════════════════════╗")
            println("   ←                        ▄▄ ▄▄                          ")
            println("                            ▒▒ ▒▒                          ")
            println("                            ▀▀ ▀▀                          ")
            println("                        ${cancion.nombre}                  ")
            println("                ─────◉──────────────────────── $duracion   ")
            println("                      ♥     ⏮ > ⏭     ↺                   ")
            println("╚═══════════════════════════════════════════════════════════╝")

        }

     }




}