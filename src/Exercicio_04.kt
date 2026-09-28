// ---| EXERCÍCIO 4 |---

// Crie uma variável numérica e exiba sua tabuada de 1 a 10


// FORMA PURA

fun exercicio4Puro(numero: Int) {

    for (i in 1..10) {

        val resultado = numero * i

        println("$numero x $i = $resultado")
    }
}


// FORMA COM MÉTODOS

fun exercicio4ComMetodos(numero: Int) {

    (1..10).forEach {

        println("$numero x $it = ${numero * it}")
    }
}
