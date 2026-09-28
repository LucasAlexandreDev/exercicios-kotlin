// ---| EXERCÍCIO 2 |---

// Crie uma variável numérica e exiba se o número é positivo
// negativo ou zero


// FORMA PURA

fun exercicio2Puro(numero: Int) {

    if (numero > 0) {
        println("Positivo")
    } else if (numero < 0) {
        println("Negativo")
    } else {
        println("Zero")
    }
}


// FORMA COM MÉTODOS

fun exercicio2ComMetodos(numero: Int) {

    val resultado = when {
        numero > 0 -> "Positivo"
        numero < 0 -> "Negativo"
        else -> "Zero"
    }

    println(resultado)
}
