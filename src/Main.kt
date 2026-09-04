import java.sql.Array
import kotlin.collections.toList
import kotlin.time.measureTime

fun main () {

    // ---| LISTA DE EXERCÍCIOS |---

    // ---| EXERCÍCIO 01 |---

    fun numberParImpar(number: Int): Int {

        val result = number % 2

        when (result) {

            0 -> println(" O $number é um número PAR")
            1 -> println(" O $number é um número IMPAR")
        }

        return result
    }

    //numberParImpar(2)


    // ---| EXERCÍCIO 02 |---

    fun tipoNumerico(number: Int): String {

        val status = if (number == 0) {
            "ZERO"

        } else if (number >= 0) {
            "POSITIVO"

        } else {
            "NEGATIVO"
        }

        val result = ("O número $number é $status")
        return result
    }

    //println(tipoNumerico(10))

    // ---| EXERCÍCIO 03 |---


    fun faixaEtaria(idade: Int): String {

        val mensagem = when (idade) {

            in 11 downTo 0 -> "A sua idade é de $idade anos! Você é uma CRIANÇA"
            in 12..17 -> "A sua idade é de $idade anos! Você é um ADOLESCENTE"
            in 18 until 60 -> "A sua idade é de $idade anos! Você é um ADULTO"
            else -> "A sua idade é de $idade anos! Você é um IDOSO"
        }

        return mensagem
    }


    //println(faixaEtaria(60))


    // ---| EXERCÍCIO 04 |---

    fun tabuada(number: Int) {

        for (i in 1..10) {
            println("$number x $i = ${number * i}")
        }
    }

    //println(tabuada(4))


    // ---| EXERCÍCIO 05 |---

    fun somaArrays(array: List<Int>): Int {

        var result = array.sum()
        return result
    }

    val numeros = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    //println(somaArrays(numeros))


    // ---| EXERCÍCIO 06 |---

    fun maiorNumberArray(array: List<Int>): Int? {

        val result = array.maxOrNull()
        return result
    }

    //println(maiorNumberArray(numeros))

    // ---| EXERCÍCIO 07 |---

    fun contagemRegressiva(number: Int) {

        for (i in number downTo 0) {
            println(i)
        }
    }

    //contagemRegressiva(3)

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

    //println(somarParesComFor(numeros))

    // ---| EXERCÍCIO 09 |---

    fun dobroNumerico(number: Int): Int {

        val result = number * 2
        return result
    }

    //println(dobroNumerico(10))


    // ---| EXERCÍCIO 10 |---

    fun mediaEscolar(nota1: Int, nota2: Int, nota3: Int): Int {

        val somaNotas = nota1 + nota2 + nota3
        val result = somaNotas / 3
        return result
    }

    //println(mediaEscolar(5, 5, 5))


    // ---| EXERCÍCIO 11 |---

    fun conversorTemperatura(celsius: Double): Double {

        val fahrenheit = (celsius * 1.8) + 32
        return fahrenheit
    }

    //println(conversorTemperatura(3.5))


    // ---| EXERCÍCIO 12 |---

    fun batataQuente(): String{

        val numbers = (100 .. 1).toList()
        var status = ""

        for (i in numbers) {

            if (i % 3 == 0) {
                status = "BATATA = $i"

            } else if (i % 5 == 0) {
                 status = "QUENTE = $i"

            }else{
                status = "BATATA-QUENTE = $i"
            }
        }

        return status
    }

    // batataQuente()



    // ---| EXERCÍCIO 13 |---

    fun listaImpar(){

        val listNumber = (100 ..1).toList()
        val impar = listNumber.map { number -> number % 2 == 1}

        print(impar)
    }

    // listaImpar()


    // ---| EXERCÍCIO 14 |---

    fun totalCompra(): Int{

        val listPrecos = (100 .. 1).toList()
        val result = listPrecos.sum()

        return result
    }

    // totalCompra()


    // ---| EXERCÍCIO 15 |---

    fun mediaIdades(): Int{

        val listaIdades = (100 .. 1).toList()
        listaIdades.map { idade -> idade >= 18}

        val quantidade   = listaIdades.size
        val somaMaioral = listaIdades.sum()

        val result = somaMaioral / quantidade
        return result
    }

    // mediaIdades()

    // ---| EXERCÍCIO 16 |---

    fun fatorial(): String {

        val numberFatorial = 10
        var texto = ""

        for (i in numberFatorial downTo 1) {

            texto = "$numberFatorial! = $i * $i"
        }

        return texto
    }

    //fatorial()


    // ---| EXERCÍCIO 17 |---

    open class Pessoa{

        var nome: String = ""

            get() {
                return field.uppercase()
            }

        var idade: Int = 0

            set(value){

                field = if (value >= 0) value else 0
            }

        var cidade: String = ""

            get() {
                return field.uppercase()
            }

        open fun mensagempersonalizada(): String{
            val mensagem = ("O ser humano $nome tem $idade anos de idade e mora em $cidade!")
            return mensagem
        }
    }

    val pessoa = Pessoa()

    pessoa.nome   = "Maria"
    pessoa.idade  = 25
    pessoa.cidade = "São Paulo"

    //println(pessoa.mensagempersonalizada())


    // ---| EXERCÍCIO 18 |---

    fun produtoCaro(): Double{

        val produto = mapOf(

            "Celular"    to 38.87,
            "Computador" to 45.00,
            "Mouse"      to 20.00
        )

        val result = produto.values.max()
        return result
    }

    //produtoCaro()


    // ---| EXERCÍCIO 19 |---

    class ContaBancaria{

        var nomeTitular: String = ""
            get() = field.uppercase()

        private var saldo: Double = 0.0

        fun depositar(number: Double) {
            saldo += number
        }

        fun sacar(number: Double) {
            saldo -= number
        }

        fun consultar(): Double{
            return saldo
        }
    }

    val contaBancaria = ContaBancaria()

    //println(contaBancaria.depositar(300.00))
    //println(contaBancaria.sacar(200.00))
    //println(contaBancaria.consultar())


    // ---| EXERCÍCIO 20 |---

    open class Funcionario{

        var nome: String = ""
        var contaBancaria = ContaBancaria()
        var salario = contaBancaria.consultar()

        open fun salario(): Double{
            return salario
        }
    }

    class Gerente: Funcionario(){

        override fun salario(): Double{

            val acrescimo = ( 20 / 100 ) * salario
            return acrescimo
        }
    }
}
