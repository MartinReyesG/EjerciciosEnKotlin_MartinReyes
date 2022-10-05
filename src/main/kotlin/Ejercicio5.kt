/*
5) Desarrollar una función que calcule el módulo de un vector.
 */

import java.math.RoundingMode
import java.text.DecimalFormat
import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    val formato = DecimalFormat("#.##")
    formato.roundingMode = RoundingMode.HALF_UP
    val vectorcito = Triple(50.04, 9.86, 42.2)

    println(formato.format(calcularModuloVector(vectorcito)))

}

fun calcularModuloVector(v: Triple<Double, Double, Double>): Double {
     val res=sqrt(v.first.pow(2.0) + v.second.pow(2.0) + v.third.pow(2.0))
    return res
}
