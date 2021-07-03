package views

import `ui `.buttonBox
import `ui `.registerUser
import helpers.sesionActiva
import model.User

fun validarAutenticacion() {
    if (sesionActiva) menuPrincipal() else registrarUsuario()
}


fun registrarUsuario() {
    var usuario: User? = null
    registerUser()
    print(" ► Ingrese su nombre: ")
    val nombre = readLine().toString()
    print(" ► Ingrese su correo electrónico: ")
    val email = readLine().toString()
    print(" ► Ingrese su contraseña: ")
    val password = readLine().toString()
    buttonBox()
    if (nombre != "" && email != "" && password != "") {
        usuario = User(nombre, email, password)
    }

    if (usuario != null) sesionActiva = true else return

    validarAutenticacion()
}