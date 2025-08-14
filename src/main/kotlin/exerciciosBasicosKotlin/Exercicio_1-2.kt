/**
 * @authorRenato de Lima Silva
 * @since 13/08/2025
 *
 * Exercício 1.2: Escreva uma expressão que:
 *                  - Receba um número inteiro
 *                  - Retorne "Positivo" se for maior que zero,
 *                            "Negativo" se for menor e
 *                            "Zero" caso contrário
 */

fun main(){

    print ("Digite um numero inteiro: ")
    var numero = readLine()!!.toInt()

    val resultado = when {
        numero > 0 -> "Positivo"
        numero < 0 -> "Negativo"
        else -> "Zero"
    }

    println("O numero é $resultado")
}