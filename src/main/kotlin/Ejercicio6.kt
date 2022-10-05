/*
6) Desarrollar una función que reciba una muestra de números y devuelva los valores atípicos,
es decir, los valores cuya puntuación típica sea mayor que 3 o menor que -3.
Nota: La puntuación típica de un valor se obtiene restando la media y
dividiendo por la desviación típica de la muestra.
 */

import java.util.*

fun main(args: Array<String>) {
    val data: MutableList<Double> = ArrayList()
    data.add(1.0)
    data.add(2.0)
    data.add(18.0)
    data.add(26.0)
    data.add(29.0)
    data.add(30.0)
    data.add(31.0)
    data.add(50.0)
    data.add(56.0)
    data.add(39.0)
    data.add(30.0)
    data.add(31.0)
    data.add(39.0)
    data.add(50.0)
    data.add(56.0)
    data.sort()
    println(datosAtipicos(data))
}

fun datosAtipicos(input: List<Double>): List<Double> {
    val output: MutableList<Double> = ArrayList()
    var superior: List<Double> = ArrayList()
    var inferior: List<Double> = ArrayList()
    if (input.size % 2 == 0) {
        superior = input.subList(0, input.size / 2)
        inferior = input.subList(input.size / 2, input.size)

    } else {
        superior = input.subList(0, input.size / 2)
        inferior = input.subList(input.size / 2 + 1, input.size)
    }
    val q1 = media(superior)
    println(q1)
    val q3 = media(inferior)
    println(q3)
    val iqr = q3 - q1
    val qinferior = q1 - 1.5 * iqr
    val qsuperior = q3 + 1.5 * iqr
    for (i in input.indices) {
        if (input[i] < qinferior || input[i] > qsuperior) output.add(input[i])
    }
    return output
}

private fun media(data: List<Double>): Double {
    return if (data.size % 2 == 0) (data[data.size / 2] + data[data.size / 2 - 1]) / 2
    else data[data.size / 2]
}