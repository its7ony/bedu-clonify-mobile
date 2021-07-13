package helpers

var sesionActiva = false

// isInteger = Esta función nos devuelve si un string es válido o no para ser tratada como número
fun isInteger(str: String?) = str?.toIntOrNull()?.let { true } ?: false
