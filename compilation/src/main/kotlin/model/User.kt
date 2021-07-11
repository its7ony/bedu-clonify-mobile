package model

import views.buttonBox
import views.topBox


class User(nombre: String, password: String){
    init {
        topBox()
        println("                                 ★ Bienvenido $nombre")
        buttonBox()
    }
}