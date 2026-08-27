import java.sql.Array
import kotlin.collections.toList

fun main (){

    // ---| LISTA DE EXERCÍCIOS |---

    // ---| EXERCÍCIO 01 |---

    fun numberParImpar(number: Int) : Int{

        val result = number % 2

        when(result){

            0 -> println(" O $number é um número PAR")
            1 -> println(" O $number é um número IMPAR")
        }

        return result
    }

    numberParImpar(2)


    // ---| EXERCÍCIO 02 |---

    fun tipoNumerico(number: Int) : String{

       val status = if(number == 0){
           "ZERO"

       }else if(number >= 0){
           "POSITIVO"

       }else{
           "NEGATIVO"
       }

        val result = ("O número $number é $status")
        return result
    }

    println(tipoNumerico(10))

    // ---| EXERCÍCIO 03 |---


    fun faixaEtaria(idade: Int): String {

        val mensagem = when (idade) {

            in 11 downTo 0  -> "A sua idade é de $idade anos! Você é uma CRIANÇA"
            in 12 .. 17     -> "A sua idade é de $idade anos! Você é um ADOLESCENTE"
            in 18 until 60  -> "A sua idade é de $idade anos! Você é um ADULTO"
            else                  -> "A sua idade é de $idade anos! Você é um IDOSO"
        }

        return mensagem
    }


    println(faixaEtaria(60))


    // ---| EXERCÍCIO 04 |---

    fun tabuada(number: Int){

        for( i in 1 .. 10){
            println(number * i)
        }
    }

    println(tabuada(4))


    // ---| EXERCÍCIO 05 |---

    fun somaArrays(array: List<Int>): Int{

        var result = array.sum()
        return result
    }

    val numeros = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(somaArrays(numeros))


    // ---| EXERCÍCIO 06 |---

    fun maiorNumberArray(array: List<Int>): Int?{

        val result = array.maxOrNull()
        return result
    }

    println(maiorNumberArray(numeros))

    // ---| EXERCÍCIO 07 |---

    fun contagemRegressiva(number: Int){

        for( i in number  downTo  0){
            println(i)
        }
    }

    contagemRegressiva(3)

    // ---| EXERCÍCIO 08 |---

    fun somarParesComFor(numeros: List<Int>): Int {

        var soma = 0

        for (numero in numeros) {

            if (numero % 2 == 0) {
                soma += numero
            }
        }

        return soma
    }

    println(somarParesComFor(numeros))

    // ---| EXERCÍCIO 09 |---

    fun dobroNumerico(number: Int): Int{

        val result = ( number * 2 )
        return result
    }

    println(dobroNumerico(10))


    // ---| EXERCÍCIO 10 |---

    fun mediaEscolar(nota1: Int, nota2: Int, nota3: Int): Int{

        val somaNotas = nota1 + nota2 + nota3
        val result    = somaNotas / 3
        return result
    }

    println(mediaEscolar(5, 5, 5))


    // ---| EXERCÍCIO 11 |---

    fun conversorTemperatura(celsius: Double): Double{

        val fahrenheit = (celsius * 1.8) + 32
        return fahrenheit
    }

    println(conversorTemperatura(3.5))
}

