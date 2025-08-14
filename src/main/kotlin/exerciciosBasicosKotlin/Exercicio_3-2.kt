
/**
 * @author Renato de Lim silva
 * @since 13/08/2025
 *
 * Exercício 3.2: Crie uma função descreveEndereco que:
 *                          - Recebe rua (String?), número (Int?), cidade (String?)
 *                          - Retorna uma string no formato "Rua [rua], Nº [número], [cidade]"
 *                          - Substitua qualquer valor nulo por "Não informado"
 */

fun descreveEndereco(rua: String?, numero: Int?, cidade: String?): String {

    val ruaDesc = rua ?: "Não informado"
    val numeroDesc = numero?.toString() ?: "Não informado"
    val cidadeDesc = cidade ?: "Não informado"

    return "Rua $ruaDesc, Nº $numeroDesc, $cidadeDesc"
}

fun main() {

    println(descreveEndereco("\nAv. 7 de Setembro", 1234, "Manaus"))
    println(descreveEndereco(null, null, "Manacapuru"))
    println(descreveEndereco("Visconde", 4321, null))

}