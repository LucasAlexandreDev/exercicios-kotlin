// ---| EXERCÍCIO 6 |---

// Encontre o maior número dentro de um array


// FORMA PURA

fun exercicio6Puro(numeros: Array<Int>): Int {

    var maior = numeros[0]

    for (numero in numeros) {

        if (numero > maior) {
            maior = numero
        }
    }

    return maior
}


// FORMA COM MÉTODOS

fun exercicio6ComMetodos(numeros: Array<Int>): Int {

    return numeros.reduce { maior, numero ->

        if (numero > maior) {
            numero
        } else {
            maior
        }
    }
}