package ui

import helpers.sesionActiva
import models.Usuario
import s5.helpers.User


fun validarAutenticacion(email:String,  pass: String){

    val login = User("root","root@root.com","toor",)

    if(email != "" && pass != ""){
        if(email==login.correo && pass== login.pass){
            menuPrincipal()
        }else{
            registrarUsuario()
        }
    }

}


fun registrarUsuario(){
    var usuario: Usuario? = null
    println(" ┌─────────────────────────────────────────────────────────┐")
    println(" │  ◁                Iniciar de Sesión             \uD83D\uDDD5︎ \uD83D\uDDD6︎ \uD83D\uDDD9︎ │")
    println(" ├─────────────────────────────────────────────────────────┤")
    print("  ✉ Ingrese su correo electrónico ► ")
    val email = readLine().toString()
    print("  ✎ Ingrese su contraseña ► ")
    val password = readLine().toString()
    println(" └─────────────────────────────────────────────────────────┘")
    if(email != "" && password != ""){
        validarAutenticacion(email,password)
    }

    if (usuario != null) sesionActiva = true else return


}