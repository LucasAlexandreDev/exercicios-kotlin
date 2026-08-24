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

    //numberParImpar(2) // Aceita somente número INT


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

    fun faixaEtária(idade: Int): String{

        when(idade){

            in 11 downTo 0 -> println(" A sua idade é de $idade anos! Você é uma CRIANÇA")
            in 12 .. 17    -> println("A sua idade é de $idade anos! Você é um ADOLESCENTE")
            in 28 until 60 -> println(" A sua idade é de $idade anos! Você é um IDOSO")
        }

        return ""
    }

    println(faixaEtária(32))


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

    val numeros = listOf(1,2,3,4,5)
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
}
