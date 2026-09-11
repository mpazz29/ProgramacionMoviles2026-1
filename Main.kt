// actividad 1
fun ejercicio1_Temperatura() {
    val celsius = 25.0
    val fahrenheit = (celsius * 9 / 5) + 32
    println("$celsius°C equivale a $fahrenheit°F")
}

// actividad 2
fun ejercicio2_IMC() {
    val peso = 70.0
    val altura = 1.75
    val imc = peso / (altura * altura)

    val clasificacion = when {
        imc < 18.5 -> "bajo peso"
        imc in 18.5..24.9 -> "peso normal"
        imc in 25.0..29.9 -> "sobrepeso"
        imc >= 30.0 -> "obesidad"
        else -> "valor fuera de rango"
    }

    println("peso: ${peso}kg, altura: ${altura}m")
    println("imc: %.2f".format(imc))
    println("clasificacion: $clasificacion")
}

// actividad 3
fun ejercicio3_ParImpar() {
    val numero = 42
    val resultado = if (numero % 2 == 0) "par" else "impar"
    println("el número $numero es: $resultado")
}

// actividad 4
fun ejercicio4_NumeroPrimo() {
    val numero = 17
    var esPrimo = true

    if (numero <= 1) {
        esPrimo = false
    } else {
        for (i in 2 until numero) {
            if (numero % i == 0) {
                esPrimo = false
                break
            }
        }
    }

    if (esPrimo) {
        println("el número $numero es primo")
    } else {
        println("el número $numero no es primo")
    }
}

// actividad 5
fun ejercicio5_SumaPares() {
    var suma = 0

    for (i in 1..100) {
        if (i % 2 == 0) {
            suma += i
        }
    }
    println("la suma de números pares del 1 al 100 es: $suma")
}

// actividad 6
fun ejercicio6_Factorial() {
    val numero = 5
    var factorial: Long = 1

    for (i in 1..numero) {
        factorial *= i
    }
    println("el factorial de $numero es: $factorial")
}

// actividad 7
fun ejercicio7_Palindromo() {
    val palabra = "anilina"
    val esPalindromo = palabra == palabra.reversed()
    val resultado = if (esPalindromo) "es un palindromo" else "no es un palindromo"
    println("la palabra '$palabra' $resultado")
}





// lo de no modificar
fun main() {
    println("=".repeat(50))
    println("TALLER 1: KOTLIN FUNDAMENTALS")
    println("Nombre: [mapa]")
    println("=".repeat(50))
    println()

    println("--- Ejercicio 1: Conversor de Temperatura ---")
    ejercicio1_Temperatura()
    println()

    println("--- Ejercicio 2: Calculadora de IMC ---")
    ejercicio2_IMC()
    println()

    println("--- Ejercicio 3: Número Par o Impar ---")
    ejercicio3_ParImpar()
    println()

    println("--- Ejercicio 4: Números Primos ---")
    ejercicio4_NumeroPrimo()
    println()

    println("--- Ejercicio 5: Suma de Números Pares ---")
    ejercicio5_SumaPares()
    println()

    println("--- Ejercicio 6: Factorial ---")
    ejercicio6_Factorial()
    println()

    println("--- Ejercicio 7: Palíndromo ---")
    ejercicio7_Palindromo()
    println()

    println("=".repeat(50))
    println("FIN DEL TALLER")
    println("=".repeat(50))
}