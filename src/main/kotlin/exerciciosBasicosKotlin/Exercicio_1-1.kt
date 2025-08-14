/**
 * @author Renato de Lim silva
 * @since 13/08/2025
 *
 * Exercício 1.1: Crie um programa que:
 *                      - Declare uma variável imutável com seu nome
 *                      - Declare uma variável mutável com sua idade
 *                      - Imprima: "Meu nome é [nome] e tenho [idade] anos"
 *                      - Incremente a idade e imprima novamente
 */

fun main(){
    val meuNome: String = "Renato de lima Silva"
    var minhaIdade: Int = 25

    println("\nMeu nome é $meuNome:  e tenho $minhaIdade anos")

    minhaIdade += 10

    println("Meu nome é $meuNome:  e tenho $minhaIdade anos")

}