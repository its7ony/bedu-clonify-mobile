package views

import helpers.sesionActiva
import kotlinx.coroutines.*
import model.User
import kotlin.coroutines.resumeWithException

fun validarAutenticacion() = runBlocking {
    withTimeout(10_000L) {
        repeat(10) { i ->
            println("Cargando ${(i * 10) + 10}% ...")
            delay(300L)
        }
    }
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





