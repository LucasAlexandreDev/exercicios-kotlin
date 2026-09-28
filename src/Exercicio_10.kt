// ---| EXERCÍCIO 10 |---

// Faça uma função que receba 3 notas e retorne a média do aluno


// FORMA PURA

fun exercicio10Puro(
    nota1: Double,
    nota2: Double,
    nota3: Double
): Double {

    val soma = nota1 + nota2 + nota3

    val media = soma / 3

    return media
}


// FORMA COM MÉTODOS

fun exercicio10ComMetodos(
    nota1: Double,
    nota2: Double,
    nota3: Double
) = (nota1 + nota2 + nota3) / 3
