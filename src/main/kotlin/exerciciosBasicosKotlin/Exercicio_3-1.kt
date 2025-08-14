/**
 * @author Renato de Lim silva
 * @since 13/08/2025
 *
 * Exercício 3.1: Escreva uma função comprimentoOuZero que:
 *                      - Recebe uma String?
 *                      - Retorna o tamanho da string ou 0 se for nula (use safe call e Elvis operator)
 */

fun comprimentoOuZero(texto: String?) = texto?.length ?: 0

fun main(){

    print("\n Digite uma Palavra: ")
    var palavra = readLine()

    println("Tamanho da palavra digitada: " + comprimentoOuZero(palavra))

    print("Tamanho da palavra (com arg NULL): " + comprimentoOuZero(null))

}