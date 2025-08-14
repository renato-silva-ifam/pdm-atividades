/**
 * @authorRenato de Lima Silva
 * @since 13/08/2025
 *
 * Exercício 2.2: Crie uma função de extensão para String chamada inverte que:
 *                      Retorna a string invertida
 *                      Exemplo: "Kotlin".inverte() → "niltok"
 */

fun String.inverte() = this.reversed()

fun main(){

    print("\nDigite uma palavra : ")
    var palavra = readLine()

    println("\nPalavra: $palavra  Palavra Invertida: " + palavra?.inverte())
}