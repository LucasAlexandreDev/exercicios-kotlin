// ---| EXERCÍCIO 8 |---

// Dado um array de números, calcule somente a soma dos números pares


// FORMA PURA

fun exercicio8Puro(numeros: Array<Int>): Int {

    var soma = 0

    for (numero in numeros) {

        if (numero % 2 == 0) {
            soma += numero
        }
    }

    return soma
}


// FORMA COM MÉTODOS

fun exercicio8ComMetodos(numeros: Array<Int>): Int {

    val pares = numeros.filter { it % 2 == 0 }

    var soma = 0

    for (numero in pares) {
        soma += numero
    }

    return soma
}