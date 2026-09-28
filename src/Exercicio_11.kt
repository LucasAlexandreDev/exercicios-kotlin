// ---| EXERCÍCIO 11 |---

// Faça uma função que receba uma temperatura Celsius
// e retorne o valor em Fahrenheit
// Fórmula: F = C x 1.8 + 32


// FORMA PURA

fun exercicio11Puro(celsius: Double): Double {

    val fahrenheit = celsius * 1.8 + 32

    return fahrenheit
}


// FORMA COM MÉTODOS

fun exercicio11ComMetodos(celsius: Double) = celsius * 1.8 + 32