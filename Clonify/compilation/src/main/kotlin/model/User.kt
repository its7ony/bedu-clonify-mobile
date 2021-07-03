package model

import `ui `.buttonBox
import `ui `.topBox

class User(nombre: String, email: String, password: String){
    init {
        topBox()
        println("                                 ★ Bienvenido $nombre")
        buttonBox()
    }
}