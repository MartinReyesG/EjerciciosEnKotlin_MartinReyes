/*
3) Desarrollar una función que reciba una frase y devuelva un diccionario
con las palabras que contiene y su longitud.
*/

fun main() {
    val frasesDeMentalidadDeTiburon = "El fracaso es la manera de empezar de nuevo, pero más inteligente"
    println(contadorDePalabras(frasesDeMentalidadDeTiburon))

}

fun contadorDePalabras(frase: String): Map<String, Int> {
    val diccionario: MutableMap<String, Int> = mutableMapOf()
    val partes = listOf(*frase.split(" ".toRegex()).toTypedArray())
    for (i in partes.indices) {
        diccionario[partes[i]] = partes[i].length
    }
    return diccionario
}