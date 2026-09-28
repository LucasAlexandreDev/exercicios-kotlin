// ---| EXERCÍCIO 5 |---

// Dado um array de números, calcule a soma de todos eles


// FORMA PURA

fun exercicio5Puro(numeros: Array<Int>): Int {

    var soma = 0

    for (numero in numeros) {

        soma += numero
    }

    return soma
}


// FORMA COM MÉTODOS

fun exercicio5ComMetodos(numeros: Array<Int>): Int {

    return numeros.reduce { soma, numero -> soma + numero }
}