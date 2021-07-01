package models

class Usuario(nombre: String, email: String, password: String){
    init {
        println(" ┌─────────────────────────────────────────────────────────┐")
        println("                   Bienvenido $nombre ✔                     ")
        println(" └─────────────────────────────────────────────────────────┘")
    }
}

