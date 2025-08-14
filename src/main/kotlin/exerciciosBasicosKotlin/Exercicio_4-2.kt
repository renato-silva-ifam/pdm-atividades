/**
 *
 */
/**
 * @author Renato de Lim silva
 * @since 13/08/2025
 *
 * Exercício 4.2: Crie uma classe Retangulo com:
 *                          - largura e altura (Double no construtor)
 *                          - Função que calcula área
 *                          - Função que calcula perímetro
 *                          - Função que retorna
 *                                      "Quadrado" se largura == altura,
 *                                      "Retângulo" caso contrário
 */

class Retangulo(val largura: Double, val altura: Double) {

    fun calcularArea(): Double {
        return largura * altura
    }

    fun calcularPerimetro(): Double {
        return 2 * (largura + altura)
    }

    fun tipo(): String {
        return if (largura == altura) "Quadrado" else "Retângulo"
    }
}

fun main() {

    val r1 = Retangulo(5.0, 5.0)
    val r2 = Retangulo(5.0, 3.0)

    println("\nÁrea r1: ${r1.calcularArea()}")
    println("Perímetro r1: ${r1.calcularPerimetro()}")
    println("Tipo r1: ${r1.tipo()}")

    println("\n\nÁrea r2: ${r2.calcularArea()}")
    println("Perímetro r2: ${r2.calcularPerimetro()}")
    println("Tipo r2: ${r2.tipo()}")
}


