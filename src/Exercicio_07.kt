// ---| EXERCÍCIO 7 |---

// Crie uma variável numérica e exiba uma contagem regressiva até zero


// FORMA PURA

fun exercicio7Puro(numero: Int) {

    for (i in numero downTo 0) {

        println(i)
    }
}


// FORMA COM MÉTODOS

fun exercicio7ComMetodos(numero: Int) {

    (numero downTo 0).forEach {

        println(it)
    }
}
