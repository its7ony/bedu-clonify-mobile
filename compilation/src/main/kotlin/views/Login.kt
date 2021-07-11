package views

import helpers.sesionActiva
import model.User

fun validarAutenticacion() {
    if (sesionActiva) menuPrincipal() else registrarUsuario()
}


fun registrarUsuario() {
    var usuario: User? = null
    registerUser()
    print(" ► Ingrese su usuario: ")
    val nombre = readLine().toString()
    print(" ► Ingrese su contraseña: ")
    val password = readLine().toString()
    buttonBox()
    if (nombre != "" && password != "") {
        usuario = User(nombre,password)
    }

    if (usuario != null) sesionActiva = true else validarAutenticacion()

    validarAutenticacion()
}