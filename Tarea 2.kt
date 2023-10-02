// Declarar una variable constante con el valor de PI
const val PI = 3.14159265359

fun main() {
    // Declarar una variable decimal
    val decimal = 3.1415

    println("Numero decimal: $decimal")

    // Convertir el decimal a flotante (Float)
    val flotante = decimal.toFloat()

    println("Numero flotante: $flotante")

    // Calcular el perímetro de un círculo
    val perimetro = 2 * PI * decimal

    // Imprimir el resultado usando un String Template
    println("El perímetro del círculo es: $perimetro")
}
