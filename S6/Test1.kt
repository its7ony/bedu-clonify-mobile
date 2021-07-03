import java.text.SimpleDateFormat
import java.util.*
//Reto 6 implementación de la paqueteria java a kotlin
fun main(){
    println(" ──────────────────────────────────────────────────────────────")
    println(   "Hola como primer paso en el registro es verificar tu edad")
    println( "Por favor ingresa tu edad de la siguiente manera dia/mes/año")
    println(" ──────────────────────────────────────────────────────────────")
    println(          "──────────────────────────────────────────")
    println("                   Ejemplo 01/12/1994")
    println(          "──────────────────────────────────────────")
var fechaNacString= readLine()
var fechaNacDate:Date=SimpleDateFormat("dd/MM/yyyy").parse(fechaNacString)
var fechaActual=Date(System.currentTimeMillis())
var diferenciaFechaMili=fechaActual.getTime()-fechaNacDate.getTime()
var segundos=diferenciaFechaMili/1000
var minutos=segundos/60
var horas=minutos/60
var dias=horas/24
var años=dias/365
var conversion= años.toInt()
if(conversion>=18){

    println("┌──────────────────────────────┐")
    println("      Tu edad es $conversion    ")
    println("└──────────────────────────────┘")
    println("es correcto?")

}else if(conversion==null){
   println("Por favor ingresa un fecha valida")
}

}