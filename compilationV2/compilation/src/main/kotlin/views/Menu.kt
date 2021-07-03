package views

import `ui `.mainMenu
import helpers.isInteger
import helpers.realizarBusqueda
import helpers.vuelveAIntentar

fun menuPrincipal(){
    mainMenu()
    val opcion = readLine()
    if(opcion != null && isInteger(opcion)) realizarBusqueda(opcion.toInt()) else vuelveAIntentar()
}