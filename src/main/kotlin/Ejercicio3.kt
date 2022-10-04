/*
3) Desarrollar una función que reciba una frase y devuelva un diccionario
con las palabras que contiene y su longitud.
*/

fun main() {
    val frase = "Hola mundo esta es una prueba para separar palabras"
    println(diccionario(frase))

}

fun diccionario(frase: String): Map<String, Int> {
    val dic: MutableMap<String, Int> = mutableMapOf()
    val partes = listOf(*frase.split(" ".toRegex()).toTypedArray())
    for (i in partes.indices) {
        dic[partes[i]] = partes[i].length
    }
    return dic
}