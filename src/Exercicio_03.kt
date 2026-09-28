// ---| EXERCÍCIO 3 |---

// Crie uma variável idade e diga:
// menor de 12 = Criança
// 12 até 17 = Adolescente
// 18 até 59 = Adulto
// 60 ou mais = Idoso


// FORMA PURA

fun exercicio3Puro(idade: Int) {

    if (idade < 12) {
        println("Criança")

    } else if (idade <= 17) {
        println("Adolescente")

    } else if (idade <= 59) {
        println("Adulto")

    } else {
        println("Idoso")
    }
}


// FORMA COM MÉTODOS / ATALHOS

fun exercicio3ComMetodos(idade: Int) {

    val resultado = when {

        idade < 12 -> "Criança"
        idade <= 17 -> "Adolescente"
        idade <= 59 -> "Adulto"

        else -> "Idoso"
    }

    println(resultado)
}