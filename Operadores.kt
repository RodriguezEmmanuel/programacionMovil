//Creando la funcion para calcular la Pendiente
fun calcularPendiente(x1: Double, y1: Double, x2: Double, y2: Double): Double {
    val numerador = y2 - y1
    val denominador = x2 - x1

    // Verificamos si el denominador es igual a cero para evitar una división por cero
    if (denominador == 0.0) {
        println("La pendiente no está definida para una línea vertical.")
    }

    return numerador / denominador
}

fun main() {
    val x1 = 4.0
    val y1 = 3.0
    val x2 = -3.0
    val y2 = -2.0

    val pendiente = calcularPendiente(x1, y1, x2, y2)
    println("La pendiente de la línea que pasa por los puntos P1($x1,$y1) y P2($x2,$y2) es: $pendiente")

}