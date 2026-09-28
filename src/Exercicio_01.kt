// ---| EXERCÍCIO 1 |---

// Crie uma variável numérica e diga se o número é par ou ímpar


// FORMA PURA

fun exercicio1Puro(numero: Int) {

    if (numero % 2 == 0) {
        println("Par")
    } else {
        println("Ímpar")
    }
}


// FORMA COM MÉTODOS

fun exercicio1ComMetodos(numero: Int) {

    println(
        if (numero % 2 == 0) {
            "Par"
        } else {
            "Ímpar"
        }
    )
}

