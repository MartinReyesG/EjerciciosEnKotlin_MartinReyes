/*
2) Desarrollar una función que reciba otra función y una lista, y
devuelva otra lista con el resultado de aplicar la función dada a
cada uno de los elementos de la lista.
 */

import java.math.RoundingMode
import java.text.DecimalFormat
import kotlin.math.pow

fun main() {

    val lista = listOf(90.0, 56.0, 245.0, 256.7, 12.9, 5.9,19.6,6.4,22.0)
    println((resta(lista) { a -> sumaCuadrados(a) }))
}

fun sumaCuadrados(valor: Double) = valor + (valor.pow(2))

fun resta(valores: List<Double>, cuadrados: (Double) -> Double): List<Double> {

    val l = mutableListOf<Double>()
    for (i in valores.indices) {
        val df = DecimalFormat("#.##")
        df.roundingMode = RoundingMode.HALF_UP
        l.add(df.format(cuadrados(valores[i]) - (valores[i] / 2.0)).toDouble())
    }

    return l
}