/**
 * @author Renato de Lim silva
 * @since 13/08/2025
 *
 * Exercício 4.1: Crie uma data class Aluno com:
 *                      - nome (String)
 *                      - matricula (String)
 *                      - notas (List<Double>)
 *                      - Adicione uma função que calcula a média
 */

data class Aluno(
    val nome: String,
    val matricula: String,
    val notas: List<Double>
) {
    fun calcularMedia(): Double {
        return notas.average()
    }
}

fun main() {
    val aluno = Aluno(
        nome = "Renato Lima",
        matricula = "2022004340",
        notas = listOf(8.5, 7.0, 9.0)
    )

    println("\nAluno: ${aluno.nome}")
    println("Matrícula: ${aluno.matricula}")
    println("Média: ${String.format("%.2f", aluno.calcularMedia())}")

}