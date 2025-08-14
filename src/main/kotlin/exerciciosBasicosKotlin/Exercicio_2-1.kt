/**
 * @author Renato de Lim silva
 * @since 13/08/2025
 *
 * Exercicio 2.1: Crie uma função chamada ehPar que:
 *                      Recebe um Int e Retorna
 *                                  true se for par,
 *                                  false caso contrário (usando expressão única)
 */

fun ehPar (numero: Int) = numero % 2 == 0

fun main(){

    print ("\nDigite um numero inteiro: ")
    var entrada:Int  = readLine()!!.toInt()

    println ("O numero $entrada è par?: " + ehPar(entrada))

}