/*
1) Desarrollar una función que aplique un descuento a un precio y otra que aplique el IVA a un precio.
Escribir una tercera función que reciba un diccionario con los precios y porcentajes
de una cesta de la compra, y una de las funciones anteriores, y utilice la función
 pasada para aplicar los descuentos o el IVA a los productos de la cesta y devolver
 el precio final de la cesta.
*/

import java.math.RoundingMode
import java.text.DecimalFormat

fun main() {
    val formatoNuevo = DecimalFormat("#.##")
    formatoNuevo.roundingMode = RoundingMode.HALF_UP
    val listaDeArticulos = listOf(
        265.36 to 15.0, 90.6 to 6.0, 4005.50 to 25.0, 7962.69 to 71.0, 8069.78 to 36.7, 74.63 to 13.10, 14.56 to 5.0,
        1265.52 to 56.10, 744.13 to 6.65, 15.00 to 3.9, 5.0 to 1.0)

    println(formatoNuevo.format(precioFinal(listaDeArticulos, { a, b -> descuentoXPrecio(a, b) }, { a -> descuentoXIva(a) })))
}

fun descuentoXPrecio(precio: Double, descuento: Double): Double {
    return  precio - (precio * descuento / 100)
}

fun descuentoXIva(precio: Double): Double {
    return precio + (precio * 0.16)
}


fun precioFinal(lista: List<Pair<Double, Double>>, des: (Double, Double) -> Double, iva: (Double) -> Double): Double {
    var total = 0.0
    for (i in lista.indices) {
        total += iva(des(lista[i].first, lista[i].second))
    }
    return total
}
