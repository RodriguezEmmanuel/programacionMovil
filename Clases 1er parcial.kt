import kotlin.math.pow

const val PI = 3.1416f
const val PHI = 1.618f

fun circleArea(radius: Float): Float {
    return PI * radius.pow(2)
}

fun main() {
    val radius = 6f
    val area = circleArea(radius)
    println("El área del círculo es: $area")
    println(getPi())
    printPhi()

    val userValidated = login("Juanito", "Navaja")
    println("¿Usuario loggeado? $userValidated")

    println("Área con valores por defecto: ${rectangleArea()}")
    println("Volumen con valores por defecto: ${volumenPrismR()}")

    imprimir("remplazo del primer valor")
    imprimir("remplazo del primer valor", "remplazo del segundo valor")
    imprimir(valor2 = "remplazo del segundo valor")

    println("Tu promedio es de: ${promedio(8f,10f,9f)}")

    verifyAge()
    gradoEscolar()

    val lado1 = 5.0
    val lado2 = 5.0
    val lado3 = 5.0
    tipoTriangulo(lado1, lado2, lado3)

    // val promedio = promedio(10f, 8f, 6f)
}

fun getPi(): Float {
    return PI
}

fun printPhi() {
    println("El número áureo vale $PHI")
}

fun login(user: String, password: String): Boolean {
    fun validate(input: String): Boolean {
        return input.isNotEmpty()
    }

    val userValidated = validate(user)
    val passValidated = validate(password)

    return userValidated && passValidated
}

fun rectangleArea(base: Double = 20.0, height: Double = 30.0): Double {
    return base * height
}

fun imprimir(
    valor: String = "Este es el primer valor por defecto",
    valor2: String = "Este es el segundo valor por reemplazo"
) {
    println(valor)
    println(valor2)
}

fun promedio(valor: Float = 8f, valor2: Float = 8f, valor3: Float): Float {
    return (valor + valor2 + valor3) / 3f
}

fun volumenPrismR(base: Double = 20.0, height: Double = 30.0, length: Double = 10.0): Double {
    return base * height * length
}

fun verifyAge() {
    print("Ingresa edad y presiona enter (escribe solo el número): ")
    val age = readLine()?.toInt()

    if (age != null) {
        if (age > 18) {
            println("¡Eres mayor de edad!")
        } else if (age == 18) {
            println("Acabas de cumplir la mayoría de edad")
        } else {
            println("Eres menor de edad")
        }
    } else {
        println("Edad no válida")
    }
}

fun gradoEscolar() {
    print("Ingresa edad y presiona enter (escribe solo el número): ")
    val age = readLine()?.toInt()

    when (age) {
        0 -> println("Apenas eres recién nacido!")
        1 -> println("Solo tienes un año de edad")
        in 2..5 -> println("Estás en preescolar")
        in 6..11 -> println("Estás en primaria")
        in 12..14 -> println("Estás en secundaria")
        in 15..17 -> println("Estás en bachillerato")
        in 18..25 -> println("Estás en la universidad")
        else -> {
            println("Edad inválida")
            println("Vuelve a correr el código")
        }
    }
}

fun tipoTriangulo(lado1: Double, lado2: Double, lado3: Double) {
    if (lado1 == lado2 && lado2 == lado3) {
        println("El triángulo es equilátero, todos los lados son iguales.")
    } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
        println("El triángulo es isósceles, tiene dos lados iguales.")
    } else {
        println("El triángulo es escaleno, todos los lados son diferentes.")
    }
}