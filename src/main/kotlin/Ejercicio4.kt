/*
4) Desarrollar una función reciba un diccionario con las asignaturas y las notas de un alumno
y devuelva otro diccionario con las asignaturas en mayúsculas y las calificaciones
correspondientes a las notas: 95-100(excelente), 85-94(Notable), 75-84(Bueno),
70-74(Suficiente)  <70(Desempeño insuficiente).
 */

fun main() {
    val kardex: Map<String, Double> = mapOf(
        "matematicas" to 50.0, "geografia" to 73.0, "español" to 80.0, "quimica" to 93.0, "historia" to 99.0
    )
    println(calif(kardex))

}

fun calif(notas: Map<String, Double>): Map<String, String> {
    val des: MutableMap<String, String> = mutableMapOf()
    for ((k, v) in notas) {
        val d = when (v) {
            in 0.0..69.0 -> "Desempeño insuficiente"
            in 70.0..74.0 -> "Suficiente"
            in 75.0..84.0 -> "Bueno"
            in 85.0..94.0 -> "Notable"
            in 95.0..100.0 -> "Excelente"
            else -> " "
        }
        des[k.uppercase()] = d
    }
    return des
}