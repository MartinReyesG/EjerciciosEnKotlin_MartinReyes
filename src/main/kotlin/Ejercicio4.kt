/*
4) Desarrollar una función reciba un diccionario con las asignaturas y las notas de un alumno
y devuelva otro diccionario con las asignaturas en mayúsculas y las calificaciones
correspondientes a las notas: 95-100(excelente), 85-94(Notable), 75-84(Bueno),
70-74(Suficiente)  <70(Desempeño insuficiente).
 */

fun main() {
    val calificaciones: Map<String, Double> = mapOf(
        "conmutacion de enrutadores" to 70.0, "programacion movil" to 93.6, "programacion web" to 65.4,
        "taller de investigacion" to 91.8, "actividad complementaria V" to 86.4, "programacion logica y funcional"
                to 100.0,"filosofia" to 78.6
    )

    println(calcularNota(calificaciones))

}

fun calcularNota(calificaciones: Map<String, Double>): Map<String, String> {
    val resultados: MutableMap<String, String> = mutableMapOf()
    for ((mat, cal) in calificaciones) {
        val d = when (cal) {
            in 0.0..69.0 -> "Desempeño insuficiente"
            in 70.0..74.0 -> "Suficiente"
            in 75.0..84.0 -> "Bueno"
            in 85.0..94.0 -> "Notable"
            in 95.0..100.0 -> "Excelente"
            else -> " "
        }
        resultados[mat.uppercase()] = d
    }
    return resultados
}