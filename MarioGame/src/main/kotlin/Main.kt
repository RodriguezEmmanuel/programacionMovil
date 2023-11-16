import clases.*

fun main() {
    /*val mario = Mario()
    mario.collision("Super Mushroom")
    mario.collision("Star")
    /*for (i in 1..5) {
        if (mario.isAlive) {
            mario.collision("Goomba")
            println("Te quedan ${mario.getLives()} vidas")
        }

        mario.collision("star")
    }*/

    val enemy = Enemy("Un enemigo", 2)
    enemy.collision("Enemy")
    enemy.collision("Weapon")

    val goomba = Goomba()
    goomba.collision("Enemy")
    goomba.collision("Weapon")


    val koopa = Koopa()
        koopa.collision("Weapon")
    */
    //PROYECTO DE TRAVEL//
/*
    val viajeMonterrey = National("Monterrey")
    viajeMonterrey.quotePrice(4)
    viajeMonterrey.reserve(4)
    val viajeMonterreyconDescuento = NationalLowSeason("Monterrey")
    viajeMonterreyconDescuento.reserve(4)
*/
    //PROYECTO DE MOVIE//
    //declaracion
    /*val scaryMovie = Movie("Scary movie", "Comedia", 88.27)
    //impresion
    println(scaryMovie)
    println(scaryMovie.name)

    scaryMovie.createdAt = "2000"
    println("Fecha de creacion:  ${scaryMovie.createdAt}")
    println(scaryMovie.component3())
    //Destruccion
    val (name2,gender2,duration2) = scaryMovie
    println("Nuevas Varibles $name2 $gender2 $duration2")
    */
    //copiar lo de las fotos

    //PROYECTO VEHICLE//
    //val  vehicleInstance = Vehicle.create()

    //FUNCIONES LITERALES
    /*var saludo = { println("Hola BEDU") }()

    var a = 5
    var b = 6 */
    //var suma = {println("Suma ${a+b}")}()

    val f: (Int, Int) -> Double
    val suma = {a: Int, b: Int -> a+b}
    println(suma(4,5))

    val presentarse: (String,Int)-> String = {name,age -> "Me llamo $name y tengo $age años"}
    println(presentarse("Javier",29))

    val saverGrade: (Double,Double) -> String = {expected: Double, saved: Double ->
        val percentage = saved / expected

        when{
            percentage > 1 -> "Ahorrador pro"
            percentage == 1.0 -> "Buen ahorrador"
            percentage < 1.0 && percentage >= 0.8 -> "Almost"
            else -> "Aprendiz saver"
        }
    }
    println(saverGrade(100.0,120.0))
//funciones anonimas
    val saverGrade2 =  fun(expected: Double, saved: Double): String{
        val percentage = saved / expected

        return when{
            percentage > 1 -> "Ahorrador pro"
            percentage == 1.0 -> "Buen ahorrador"
            percentage < 1.0 && percentage >= 0.8 -> "Almost"
            else -> "Aprendiz saver"
        }
    }
    println(saverGrade2(100.0,70.0))

    //Funcion de orden superio (higher-order functions)
    fun sumaOrdenSuperior(a: Int, b: Int, suma: (Int,Int) -> Int): Int{
        return suma(a,b)
    }
    println(sumaOrdenSuperior(8,7, suma))
}
