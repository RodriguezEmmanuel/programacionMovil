fun main() {
    val x1 = 4.0
    val y1 = 3.0
    val x2 = -3.0
    val y2 = -2.0

    val formula = (y2 - y1) / (x2 - x1)

    //limitar los decimales a 10
    val pendiente = String.format("%.10f", formula)

    println("La pendiente de la línea que pasa por los puntos P1($x1,$y1) y P2($x2,$y2) es: $pendiente")
}
