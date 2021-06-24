package ui

import helpers.sesionActiva
import models.Usuario


fun validarAutenticacion(){
    if(sesionActiva){
        menuPrincipal()
    }else{
        registrarUsuario()
    }
}


fun registrarUsuario(){
    var usuario: Usuario? = null

    println("Inicio de Sesión")
    println("Ingrese su nombre. Ej Luis Robles")
    val nombre = readLine().toString()
    println("Ingrese su correo electrónico. Ej luis.robles@gmail.com")
    val email = readLine().toString()
    println("Ingrese su contraseña. Ej *****")
    val password = readLine().toString()

    if(nombre != "" && email != "" && password != ""){
        usuario = Usuario(nombre, email, password)
    }

    if (usuario != null) sesionActiva = true else return

    validarAutenticacion()
}